package cn.ssm.test.vo;

import java.util.List;

/**
 * 
 * @Description: 分页VO
 * @author: che
 * @Date: 2015年4月13日 下午1:39:42
 */
public class pageVO {
	private List records; // 要显示的分页记录
	private int page; // 当前页码：可由用户指定
	private int pageSize=7; // 每页显示的记录条数,默认7 
	private int totalPage; // 总页数
	private int prePage; // 上一页的页码
	private int nextPage; // 下一页的页码
	private int startIndex; // 数据库每页开始记录的索引
	private int totalRecords; // 总记录的条数
	
	// 平铺型分页
	private int startPage; // 开始页码
	private int endPage; // 结束页码
	
	private String url; // 查询分页的请求地址   xxx?xx=xx
	
	//page：用户要看的页码
	//totalRecords:总记录条数
	public pageVO(int page,int totalRecords){
		this.page = page;
		this.totalRecords = totalRecords;
		
		//计算总页数
		totalPage = totalRecords%pageSize==0?totalRecords/pageSize:(totalRecords/pageSize+1);
		//计算每页开始的索引
		startIndex = (page-1)*pageSize;
		
		//计算开始和结束页码:7个页码
		if(totalPage>7){
			//超过7页
			startPage = page-3;
			endPage = page+3;
			
			if(startPage<1){
				startPage = 1;
				endPage = 7;
			}
			if(endPage>totalPage){
				endPage = totalPage;
				startPage = endPage-6;
			}
		}else{
			//没有7页
			startPage = 1;
			endPage = totalPage;
		}
	}
	
	//page：用户要看的页码
	//totalRecords:总记录条数
	public pageVO(int page,int totalRecords, int pageSize){
		this.page = page;
		this.totalRecords = totalRecords;
		this.pageSize = pageSize;
		
		//计算总页数
		totalPage = totalRecords%pageSize==0?totalRecords/pageSize:(totalRecords/pageSize+1);
		//计算每页开始的索引
		startIndex = (page-1)*pageSize;
		
		//计算开始和结束页码:7个页码
		if(totalPage>7){
			//超过7页
			startPage = page-3;
			endPage = page+3;
			
			if(startPage<1){
				startPage = 1;
				endPage = 7;
			}
			if(endPage>totalPage){
				endPage = totalPage;
				startPage = endPage-6;
			}
		}else{
			//没有7页
			startPage = 1;
			endPage = totalPage;
		}
	}
	
	// 数据量足够 多 时，瀑布流分页对象的初始方法
	public pageVO(int page) {
		this.page = page;
		//计算每页开始的索引
		startIndex = (page-1)*pageSize;
	}

	public List getRecords() {
		return records;
	}

	public void setRecords(List records) {
		this.records = records;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPrePage() {
		prePage = page - 1;
		if(prePage < 1) {
			prePage = 1;
		}
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		nextPage = page + 1;
		if(nextPage > totalPage) {
			nextPage = totalPage;
		}
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
