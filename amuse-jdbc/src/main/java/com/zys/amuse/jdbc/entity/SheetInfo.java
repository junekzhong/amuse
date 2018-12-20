package com.zys.amuse.jdbc.entity;

public class SheetInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column amuse_sheet_info.id
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column amuse_sheet_info.sheet_name
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    private String sheetName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column amuse_sheet_info.sheet_order
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    private int sheetOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column amuse_sheet_info.book_id
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    private Integer bookId;

    private String dataTable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column amuse_sheet_info.id
     *
     * @return the value of amuse_sheet_info.id
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column amuse_sheet_info.id
     *
     * @param id the value for amuse_sheet_info.id
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column amuse_sheet_info.sheet_name
     *
     * @return the value of amuse_sheet_info.sheet_name
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public String getSheetName() {
        return sheetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column amuse_sheet_info.sheet_name
     *
     * @param sheetName the value for amuse_sheet_info.sheet_name
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column amuse_sheet_info.sheet_order
     *
     * @return the value of amuse_sheet_info.sheet_order
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public int getSheetOrder() {
        return sheetOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column amuse_sheet_info.sheet_order
     *
     * @param sheetOrder the value for amuse_sheet_info.sheet_order
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public void setSheetOrder(int sheetOrder) {
        this.sheetOrder = sheetOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column amuse_sheet_info.book_id
     *
     * @return the value of amuse_sheet_info.book_id
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column amuse_sheet_info.book_id
     *
     * @param bookId the value for amuse_sheet_info.book_id
     *
     * @mbggenerated Thu Nov 29 18:16:12 CST 2018
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getDataTable() {
        return dataTable;
    }

    public void setDataTable(String dataTable) {
        this.dataTable = dataTable;
    }
}