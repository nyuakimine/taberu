package ltd.newbee.mall.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 */
public class TotalAndAvg implements Serializable {

    //总记录数
    private int commentTotal;
    //avg
    private int commentAvg;
	public int getCommentTotal() {
		return commentTotal;
	}
	public void setCommentTotal(int commentTotal) {
		this.commentTotal = commentTotal;
	}
	public int getCommentAvg() {
		return commentAvg;
	}
	public void setCommentAvg(int commentAvg) {
		this.commentAvg = commentAvg;
	}

}
