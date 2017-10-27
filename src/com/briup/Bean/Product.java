package com.briup.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 * 产品
 */
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//产品名称
	private String name;
	//产品价格
	private double price;
	//付款方式
	private String service_fg;
	//是否免运费
	private String service_myf;
	//取货方式eg:自提
	private String service_zt;
	//退货情况提示
	private String service_th;
	//产品的版本： 1精装版，2简装版，4收藏版等...
	private int version;
	//产品的库存
	private long stock;
	//产品的描述信息
	private String description;
	/*
	 * 产品的参数
	 */
	//产品的作者
	private String writer;
	//书的页数
	private long pages;
	//书的唯一标示码
	private String ISBN;
	//出版时间
	private String publish_date;
	//图片地址
	private String feature_images;
	//产品的图片
	private String images;
	//产品清单
	private String bill;
	//产品上架时间
	private String start_date;
	//产品销售的数量
	private long sale_num;
	//特推产品 1 普通产品 0，热卖2（最多3件）
	private int flag;
	//说明,如覆盖什么。。。知识点
	private String explain;
	//出版社
	private Publish publish;
	private int publish_id;
	//产品所属的类型
	private CategoryDetail cate_detail;
	private int cat_detail_id;
	
	    //产品的评价
		private Set<Evaluate> evaluates;
		//订单项
		private Set<OrderLine> orderlines;
		//简报
		private Set<Report> reports;
	
	public Product(long id, String name, double price, String service_fg,
			String service_myf, String service_zt, String service_th,
			int version, long stock, String description, String writer,
			long pages, String iSBN, String publish_date,
			String feature_images, String images, String bill,
			String start_date, long sale_num, int flag, String explain,
			 int publish_id,int cat_detail_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.service_fg = service_fg;
		this.service_myf = service_myf;
		this.service_zt = service_zt;
		this.service_th = service_th;
		this.version = version;
		this.stock = stock;
		this.description = description;
		this.writer = writer;
		this.pages = pages;
		this.ISBN = iSBN;
		this.publish_date = publish_date;
		this.feature_images = feature_images;
		this.images = images;
		this.bill = bill;
		this.start_date = start_date;
		this.sale_num = sale_num;
		this.flag = flag;
		this.explain = explain;
		this.publish_id = publish_id;
		this.cat_detail_id = cat_detail_id;
	}

	public int getPublish_id() {
		return publish_id;
	}

	public void setPublish_id(int publish_id) {
		this.publish_id = publish_id;
	}

	public int getcat_detail_id() {
		return cat_detail_id;
	}

	public void setcat_detail_id(int cat_detail_id) {
		this.cat_detail_id = cat_detail_id;
	}
	
	
	
	
	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", service_fg=" + service_fg + ", service_myf=" + service_myf
				+ ", service_zt=" + service_zt + ", service_th=" + service_th
				+ ", version=" + version + ", stock=" + stock
				+ ", description=" + description + ", writer=" + writer
				+ ", pages=" + pages + ", ISBN=" + ISBN + ", publish_date="
				+ publish_date + ", feature_images=" + feature_images
				+ ", images=" + images + ", bill=" + bill + ", start_date="
				+ start_date + ", sale_num=" + sale_num + ", flag=" + flag
				+ ", explain=" + explain + ", publish=" + publish
				+ ", publish_id=" + publish_id + ", cate_detail=" + cate_detail
				+ ", cat_detail_id=" + cat_detail_id + ", evaluates="
				+ evaluates + ", orderlines=" + orderlines + ", reports="
				+ reports + "]";
	}

	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getService_fg() {
		return service_fg;
	}
	public void setService_fg(String service_fg) {
		this.service_fg = service_fg;
	}
	public String getService_myf() {
		return service_myf;
	}
	public void setService_myf(String service_myf) {
		this.service_myf = service_myf;
	}
	public String getService_zt() {
		return service_zt;
	}
	public void setService_zt(String service_zt) {
		this.service_zt = service_zt;
	}
	public String getService_th() {
		return service_th;
	}
	public void setService_th(String service_th) {
		this.service_th = service_th;
	}

	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Publish getPublish() {
		return publish;
	}
	public void setPublish(Publish publish) {
		this.publish = publish;
	}
	public long getPages() {
		return pages;
	}
	public void setPages(long pages) {
		this.pages = pages;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getFeature_images() {
		return feature_images;
	}
	public void setFeature_images(String feature_images) {
		this.feature_images = feature_images;
	}
	
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public CategoryDetail getCate_detail() {
		return cate_detail;
	}
	public void setCate_detail(CategoryDetail cate_detail) {
		this.cate_detail = cate_detail;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public Set<Evaluate> getEvaluates() {
		return evaluates;
	}
	public void setEvaluates(Set<Evaluate> evaluates) {
		this.evaluates = evaluates;
	}
	public Set<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(Set<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public long getSale_num() {
		return sale_num;
	}
	public void setSale_num(long sale_num) {
		this.sale_num = sale_num;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public Set<Report> getReports() {
		return reports;
	}
	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}
	
	
}
