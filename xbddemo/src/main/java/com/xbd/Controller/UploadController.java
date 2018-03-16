/*package com.xbd.Controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import com.alibaba.fastjson.JSONObject;
import com.xbd.common.Constant;
import com.xbd.common.utils.PropertiesUtils;
import com.xbd.common.utils.http.HttpclientUtil;


@Controller
@RequestMapping(value="/admin/file")
@Transactional(value = "transactionManager")
public class UploadController {

	private static final Log LOG = LogFactory.getLog(UploadController.class); 
	*//**
	 * 推荐采用springmvc封装的文件上传功能
	 * com.aweb.platform.util.StringUtils
	 * @param request
	 * @param response
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 *//*
	@RequestMapping(value="/uploadImg", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> upload(HttpServletRequest request, HttpServletResponse response)
			throws IllegalStateException, IOException {
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		ServletContext ctx = request.getSession().getServletContext();
		String pigImgPath = PropertiesUtils.getProperty(Constant.FILE_IMG_URL_PREFIX);// 生猪图片存储路径
		Map<String, Object> map = new HashMap<String,Object>();
		String fileIcon = "";
		try {
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();
				while (iter.hasNext()) {
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null) {
						CommonsMultipartFile comFile = (CommonsMultipartFile) file;
						FileItem fileItem = comFile.getFileItem();
						String attachName = fileItem.getName();
						InputStream fileItemIS = fileItem.getInputStream();
						ImageInputStream iis = ImageIO
								.createImageInputStream(fileItemIS);
						Iterator<ImageReader> readIter = ImageIO
								.getImageReaders(iis);
						if (!readIter.hasNext()) {
							throw new RuntimeException("No readers found!");
						}
						ImageReader reader = readIter.next();
						System.out.println("Format: " + reader.getFormatName());
						String fileType = reader.getFormatName();
						iis.close();
						Long timestamp = new Date().getTime();
						// 重命名上传后的文件名
						String destFleName = PropertiesUtils
								.getProperty(Constant.GOODS_PIG_IMG_PATH)
								+ new Date().getTime()
								+ StringUtils.nvl(Math.random()).replace(".","") + "." + fileType;
//								+StringUtils.
						System.out.println("fileName==:" + destFleName);
						// 定义上传路径
						String path = ctx.getRealPath("/") + destFleName;
						File remoteFile = new File(path);
						file.transferTo(remoteFile);
						String fileServerUrl = PropertiesUtils
								.getProperty(GoodsConstants.FILE_SYS_SERVER_URL);
						StringBuffer url = new StringBuffer();
						url.append(fileServerUrl).append("?uploadSource=mall");
						url.append("&timestamp=").append(timestamp);
						url.append("&sign=").append(
								MD5.encryption(timestamp + "9k3#8j"));
						Map<String, String> params = new HashMap<String, String>();
						params.put("thumbnail", "true");// 是否需要加密
						JSONObject fileJson = HttpclientUtil.postFile(
								url.toString(), new File(path), attachName,
								params);
						FileHelpUtil.deleteFile(path);// 删除原文件
						if (fileJson != null	&& "0".equals(StringUtils.nvl(fileJson.get("ret")))) {
							System.out.println(fileJson);
							String smallIcon = StringUtils.nvl(fileJson.get("smallIcon"));//缩略图
							map.put("smallIcon", smallIcon);
							fileIcon = StringUtils.nvl(fileJson.get("filepath"));//原图
							System.out.println("图片上传路径：" + fileIcon);
							fileIcon = fileIcon.replaceAll(pigImgPath, "");
						}
					}
				}
			}
			map.put("imgPre", pigImgPath);
			map.put("img", fileIcon);
		} catch (Exception e) {
			LOG.warn("文件上传失败，请联系管理员！", e);
		}
		return map;
	}
}
*/