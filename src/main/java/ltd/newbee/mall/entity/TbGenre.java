package ltd.newbee.mall.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TbGenre {

	private Long genreId;
	private String name1;
	private String name2;
	private String name3;
	public Long getGenreId() {
		return genreId;
	}
	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	@Override
	public String toString() {
		return "TbGenre [genreId=" + genreId + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + "]";
	}

}