package com.xbd.common;

public class Constant {
    public static final String MEMCACHE_PREFIX_KEY = "NXMALL_CACHE_";

    public static final String TOKEN_COOKIE_NAME = "ticketCookie";


    public static final String CURR_USER_INFO_OBJ = "userInfoObj";
    public static final String CURR_USER_INFO_ZNT = "userInfoZNT";
    
    public static final String CHANGE_SHOPID = "changeShopId";
    
    /**
     * 表单重复提交
     */
    public static final String SESSION_FORM_TOKEN_KEY = "token_key";
    
    /**
     * 表单token属性
     */
    public static final String FORM_TOKEN_KEY = "token";
    
    /**
     * 重置session中的TOKEN值
     */
    public static final String RESET_SESSION_TOKEN_KEY = "reset_token";
    
    /**
     * 判断标准 是1
     */
    public static final Integer JUDGE_FLAG_YES = 1;
    
    /**
     * 判断标准 否 0
     */
    public static final Integer JUDGE_FLAG_NO = 0;
    
    /**
     * 用与判断用户的地图级别是否小于7
     */
    public static final Integer RANKMAP=7;

    public static final String DATE_FORMAT_TYPE_EN_TIME = "yyyyMMddHHmm";
    public static final String DATE_FORMAT_TYPE_YMD = "yyyy-MM-dd";
    public static final String DATETIMEFORM="yyyy-MM-dd HH:mm";
    /**
     * 订单信息缓存时间
     */
    public static final int REDIS_ORDER_TIMEOUT_LEN = 20;
    
    /**
     * 订单信息缓存时间
     */
    public static final int REDIS_ORDER_BALANCE_TIMEOUT_LEN = 70;
    
    /**
     * 管理编号超时时长
     */
    public static final int REDIS_MANAGER_NO_TIMEOUT_LEN = 120;

    /**
     * 智农通消息url中消息id参数名称
     */
    public static final String ZNT_PARAMNAME_MESSAGEID = "messageId";
    public static final String REQUEST_AJAX="x-requested-with";
    public static final String BAIDU_URL="IP_URL";
    public static final String BAIDU_KEY="APIStore_key";
    public static final Integer ADDRID=30003;
    public static final String ADDRNAME="addrSwitch";
    public static final String HOLIDAY_URL="HOLIDAY_URL";

    public static final String OPENTYPE_NAME="openType";

    public static final  String DSJ_PIG_URL="dsj_pig_url";
    public static final  String MOVEURL="moveURL";
    public static final  String MOVEURLNEW="moveURLNew";
    //OA接口
    public static final  String OA_PER_URL="oaPerURL";

    //买家身份标签
    public static final String PARAM_VALUE="其它";

    //是否是游客
    public static final String IS_VISITOR="yes";


    //农信接口中的tokenname
    public static final String  NXIN_ACCESSTOKEN="accessToken";
    //农信接口中的systemIdname
    public static final String NXIN_SYSTEMID="systemId";
    //农信接口中的timestampname
    public static final String NXIN_TIMESTAMP="timestamp";
    /**
     * 天威认证的地址
     */
    public static final String CA_ITRUSURL="itrusUrl";
    public static final String CONTRACT_ZJS_KEY="ZJS";
    public static final String CONTRACT_ZJS_REDIS_KEY="CA";
    public static final String UPLOADFILE_PATH="uploadFilePath";
    public static final String ITRUSORGCODE="itrusOrgCode";

    //运输险
    public static final String MD5_KEY = "zjs-bx-8xPv~";
    public static final String PICC = "PICC"; // 人保
    public static final String BUSI_NO = "NX-I-001";//业务线
    public static final Integer IS_COMM_MEN = 2; // 个人
    public static final Integer IS_COMM_FIRM = 1; // 企业
    public static final Integer INSURE_STATUS_NO = 0; // 未投保
    public static final Integer INSURE_STATUS_APPLY = 1; // 申请中
    public static final Integer INSURE_STATUS_SUSS = 2; // 申请成功
    public static final Integer INSURE_STATUS_FAIT = 3; // 申请失败

    public static final String DDHC_URL_ADD="ddhc_url_add";
    public static final String DDHC_SYSTEM_KEY="ddhc_system_key";

    /**
     * 成功或失败
     */
    public static final String SUCCESS = "1";
    public static final String FAIL = "0";

    /**
     * 设备型号
     */
    public static final String IOS = "IOS"; // iPhone&iPad
    public static final String ANDROID = "Android";
    /**
     * 图片类型
     */
    public static final Integer SYSTEM_FILE_TYPE_PIC = 0;//文件类型0-图片
    public static final Integer SYSTEM_FILE_TYPE_VIDEO = 1;//文件类型1-视频
    public static final Integer SYSTEM_FILE_TYPE_DESC = 2;//文件类型2-说明
    
   // public static final Integer PIC_TYPE_TRABDER=1; // 贸易商图片
   // public static final Integer PIC_TYPE_ABATTAGEAUDIT =2;//屠宰企业图片
    public static final Integer PIC_TYPE_MANU=3; // 猪场图片
    public static final Integer PIC_TYPE_BUSINESSLICENCE =4;//营业执照
    public static final Integer PIC_TYPE_SLAUGHTER=5; // 屠宰许可证
    public static final Integer PIC_TYPE_ANIMAL_PREVENTION =6; // 动物防疫条件合格证
    public static final Integer PIC_TYPE_BREEDINGID=7; // 核心育种场/省级重点育种场证书
    public static final Integer PIC_TYPE_PRODUCTIVITYID=8; // 种畜生产经营许可证
    public static final Integer PIC_TYPE_REGINALMARKET=9; // 区域市场图片
    public static final Integer PIC_TYPE_GOODINFO=10; // 商品图片
    public static final Integer PIC_TYPE_QUARANTINE=11;//检疫单图片
    public static final Integer PIC_TYPE_EVALUATION=12;//评价图片
    public static final Integer VIDEO_TYPE_GOODS=13;//商品视频
    public static final Integer SHOP_DATA_DESC=14;//旗舰店文本说明
    public static final Integer PIC_TYPE_SHOP=15;//店铺图片
    /**
     * 出售/截止
     */
    public static final String SELLER_DATE_TYPE = "出售"; // 发布生猪的消息
    public static final String END_DATE_TYPE = "截止";//发布种猪或仔猪的消息
	/**
	 * 第一页
	 */
	public static final Integer PAGE_NUMBER = 1;//第一页
	/**
	 * 默认页面大小
	 */
	public static final Integer PAGE_SIZE = 5;//第一页

	/**
	 * 业务类型
	 */
	public static final Integer SETTINGS_SEARCH_BUSTYPE=1;
	/**
	 * 竞价列表
	 */
    public static final Integer AUCTION_LIST = 6; //竞价列表展示
	/**
	 * 签约方式
	 */
    public static final String SIGN_TYPE_M = "m"; //签约方式 短信
	/**
	 * 签约方式
	 */
    public static final String SIGN_TYPE_N = "n"; //签约方式 柜台/网签
    
    /**
     * 重庆农信
     */
    public static final String NX_P_CQ = "NX-P-CQ"; //重庆农信平台
    /**
     * 北京农信
     */
     public static final String NX_P_BJ = "NX-P-BJ"; //北京农信平台
    
     //身份验证
     public static final String IDENTIFIER_COUP="~农信现金券接口~";//身份验证
     //现金券请求路径
     public static final String COUP_URL="coup.url";
     
 	/**
 	 * 上传检疫单获取现金券比例(卖家)
 	 */
 	public static final Double QUAR_COUP_RATE_SELLER =0.8;
 	/**
 	 * 上传检疫单获取现金券比例(买家)
 	 */
 	public static final Double QUAR_COUP_RATE_BUYER =0.2;  
 	/**
 	 * 检疫单未审核
 	 */
 	public static final String COUP_INIT ="COUP_INIT";
 	/**
 	 * 检疫单审核通过
 	 */
 	public static final String COUP_THROUGH ="COUP_THROUGH";
 	/**
 	 * 检疫单审核拒绝
 	 */
 	public static final String COUP_REFUSE ="COUP_REFUSE";
 	/**
 	 * 返回
 	 */
 	public static final Integer QUAR_ANTH_UNTHR =2;
 	public static final Integer QUAR_DATA_ERR =3;
 	public static final String MOB_GOODS_LIST_PAGESIZE ="mob.goods.list.pageSize";
 	
 	/**
 	 * 店铺搜索方式
 	 */
 	public static final Integer QUERY_SHOP_1 =1;
 	public static final Integer QUERY_SHOP_2 =2;
 	public static final String BRAND_SHOP ="BRANDSHOP"; // 品牌
 	
 	public static final String CITY_STR ="北京市,天津市,上海市,重庆市";

 	public static final String ETPWEB_ETPMOB_URL = "etpweb_etpmob";
 	public static final String ETPWEB_ETPPC_URL  = "etpweb_etppc";
 	public static final String ETPWEB_ZJSPC_URL  = "etpweb_zjspc";
 	public static final String ETPWEB_ZJSMOB_URL = "etpweb_zjsmob";

 	public static final String SC_URL = "sc.url";
 	public static final String HQB_URL = "hqbUrl";
 	public static final String CMSCENTER_Url = "cmscenter";
 	
 	
 	public static final String USER_TYPE_BUYER = "BUYER";//用户类型-买家
 	
 	public static final String USER_TYPE_SELLER = "SELLER";//用户类型-卖家
 	
 	/**
     * 为etpbase和etpweb提供接口统一编码:0成功,1:失败 
     */
 	public static final String JUDGE_CODE_ZERO = "0";
 	public static final String JUDGE_CODE_ONE = "1";
}
