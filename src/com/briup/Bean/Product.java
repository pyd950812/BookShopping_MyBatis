package com.briup.Bean;

import java.io.Serializable;
import java.util.Set;

/*
 * ��Ʒ
 */
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	//��Ʒ����
	private String name;
	//��Ʒ�۸�
	private double price;
	//���ʽ
	private String service_fg;
	//�Ƿ����˷�
	private String service_myf;
	//ȡ����ʽeg:����
	private String service_zt;
	//�˻������ʾ
	private String service_th;
	//��Ʒ�İ汾�� 1��װ�棬2��װ�棬4�ղذ��...
	private int version;
	//��Ʒ�Ŀ��
	private long stock;
	//��Ʒ��������Ϣ
	private String description;
	/*
	 * ��Ʒ�Ĳ���
	 */
	//��Ʒ������
	private String writer;
	//���ҳ��
	private long pages;
	//���Ψһ��ʾ��
	private String ISBN;
	//����ʱ��
	private String publish_date;
	//ͼƬ��ַ
	private String feature_images;
	//��Ʒ��ͼƬ
	private String images;
	//��Ʒ�嵥
	private String bill;
	//��Ʒ�ϼ�ʱ��
	private String start_date;
	//��Ʒ���۵�����
	private long sale_num;
	//���Ʋ�Ʒ 1 ��ͨ��Ʒ 0������2�����3����
	private int flag;
	//˵��,�縲��ʲô������֪ʶ��
	private String explain;
	//������
	private Publish publish;
	private int publish_id;
	//��Ʒ����������
	private CategoryDetail cate_detail;
	private int cat_detail_id;
	
	    //��Ʒ������
		private Set<Evaluate> evaluates;
		//������
		private Set<OrderLine> orderlines;
		//��
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
