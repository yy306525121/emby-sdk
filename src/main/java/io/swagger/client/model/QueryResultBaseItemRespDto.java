/*
 * Emby Server REST API
 * 
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * QueryResultBaseItemDto
 */


public class QueryResultBaseItemRespDto {
  @SerializedName("Items")
  private List<BaseItemDto> items = null;

  @SerializedName("TotalRecordCount")
  private Integer totalRecordCount = null;

  public QueryResultBaseItemRespDto items(List<BaseItemDto> items) {
    this.items = items;
    return this;
  }

  public QueryResultBaseItemRespDto addItemsItem(BaseItemDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BaseItemDto>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<BaseItemDto> getItems() {
    return items;
  }

  public void setItems(List<BaseItemDto> items) {
    this.items = items;
  }

  public QueryResultBaseItemRespDto totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

   /**
   * Get totalRecordCount
   * @return totalRecordCount
  **/
  @Schema(description = "")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResultBaseItemRespDto queryResultBaseItemDto = (QueryResultBaseItemRespDto) o;
    return Objects.equals(this.items, queryResultBaseItemDto.items) &&
        Objects.equals(this.totalRecordCount, queryResultBaseItemDto.totalRecordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalRecordCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultBaseItemDto {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
