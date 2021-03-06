/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * CronJobStatus represents the current state of a cron job.
 */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")

public class V2alpha1CronJobStatus {
  @SerializedName("active")
  private List<V1ObjectReference> active = null;

  @SerializedName("lastScheduleTime")
  private DateTime lastScheduleTime = null;

  public V2alpha1CronJobStatus active(List<V1ObjectReference> active) {
    this.active = active;
    return this;
  }

  public V2alpha1CronJobStatus addActiveItem(V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<V1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Active holds pointers to currently running jobs.
   * @return active
  **/
  @ApiModelProperty(value = "Active holds pointers to currently running jobs.")
  public List<V1ObjectReference> getActive() {
    return active;
  }

  public void setActive(List<V1ObjectReference> active) {
    this.active = active;
  }

  public V2alpha1CronJobStatus lastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

   /**
   * LastScheduleTime keeps information of when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
  **/
  @ApiModelProperty(value = "LastScheduleTime keeps information of when was the last time the job was successfully scheduled.")
  public DateTime getLastScheduleTime() {
    return lastScheduleTime;
  }

  public void setLastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1CronJobStatus v2alpha1CronJobStatus = (V2alpha1CronJobStatus) o;
    return Objects.equals(this.active, v2alpha1CronJobStatus.active) &&
        Objects.equals(this.lastScheduleTime, v2alpha1CronJobStatus.lastScheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1CronJobStatus {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
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

