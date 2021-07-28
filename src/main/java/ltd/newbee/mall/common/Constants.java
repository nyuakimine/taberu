/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.common;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 * @apiNote 常量配置
 */
public class Constants {
    //public final static String FILE_UPLOAD_DIC = "/opt/image/upload/";//上传文件的默认url前缀，根据部署设置自行修改
    public final static String FILE_UPLOAD_DIC = "C:\\Users\\niuxi\\OneDrive\\ドキュメント\\upload\\";//上传文件的默认url前缀，根据部署设置自行修改
    
    public final static String FILE_UPLOAD_CSV = "C:\\Users\\USER\\Desktop\\upload\\tset.csv";//上傳csv文件
    
    public final static String FILE_UPLOAD_TEST_CSV = ("/upload/tset.csv");//resultSuccess("/upload/tset.csv");
    
    public final static String FILE_UPLOAD_TXT = "C:\\Users\\USER\\Desktop\\demo.txt";//上傳txt文件
    
    public final static String FILE_UPLOAD_TEST_TXT = ("/demo.txt");//resultSuccess("/upload/tset.txt");
	    
    public final static int INDEX_CAROUSEL_NUMBER = 5;//首页轮播图数量(可根据自身需求修改)

    public final static int INDEX_CATEGORY_NUMBER = 10;//首页一级分类的最大数量

    public final static int SEARCH_CATEGORY_NUMBER = 8;//搜索页一级分类的最大数量

    public final static int INDEX_GOODS_HOT_NUMBER = 4;//首页热卖商品数量
    public final static int INDEX_GOODS_NEW_NUMBER = 5;//首页新品数量
    public final static int INDEX_GOODS_RECOMMOND_NUMBER = 10;//首页推荐商品数量

    public final static int SHOPPING_CART_ITEM_TOTAL_NUMBER = 13;//购物车中商品的最大数量(可根据自身需求修改)

    public final static int SHOPPING_CART_ITEM_LIMIT_NUMBER = 5;//购物车中单个商品的最大购买数量(可根据自身需求修改)

    public final static String MALL_VERIFY_CODE_KEY = "mallVerifyCode";//验证码key

    public final static String MALL_USER_SESSION_KEY = "newBeeMallUser";//session中user的key

    public final static int GOODS_SEARCH_PAGE_LIMIT = 10;//搜索分页的默认条数(每页10条)
    
    public final static int ORDER_SEARCH_PAGE_LIMIT = 3;//我的订单列表分页的默认条数(每页3条)
    public final static int GOODS_QA_PAGE_LIMIT = 3;//goodsQa列表分页的默认条数(每页3条)
    public final static int SELL_STATUS_UP = 0;//商品上架状态
    public final static int SELL_STATUS_DOWN = 1;//商品下架状态
    
    public final static int CATEGORY_FETCH_ERROR = 300;// リターンコード
    public final static String CATEGORY_FETCH_ERROR_MESSAGE = "カテゴリー取得出来ません";
    
    
}