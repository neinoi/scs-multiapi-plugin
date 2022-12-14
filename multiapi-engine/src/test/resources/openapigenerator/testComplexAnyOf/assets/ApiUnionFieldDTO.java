package net.coru.multifileplugin.testcomplexanyof.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import net.coru.multifileplugin.testcomplexanyof.model.ApiTypeArrayDTO;
import java.util.List;
import java.util.ArrayList;
import net.coru.multifileplugin.testcomplexanyof.model.exception.ModelClassException;

public class ApiUnionFieldDTO {

  @JsonProperty(value ="defaultItem")
  private Object defaultItem;
  @JsonProperty(value ="generatedFlag")
  private Boolean generatedFlag;
  @JsonProperty(value ="type")
  private String type;
  @JsonProperty(value ="unionEnum")
  private UnionEnum unionEnum;
  public enum UnionEnum {
    ONEOF("oneof"),
    ANYOF("anyof"),
    ALLOF("allof");

    private String value;

    UnionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }
  @JsonProperty(value ="name")
  private String name;
  @JsonProperty(value ="optionalUnion")
  private Boolean optionalUnion;
  @JsonProperty(value ="values")
  private List<ApiTypeArrayDTO> values = new ArrayList<ApiTypeArrayDTO>();

  private ApiUnionFieldDTO(Object defaultItem, Boolean generatedFlag, String type, UnionEnum unionEnum, String name, Boolean optionalUnion, List<ApiTypeArrayDTO> values) {
    this.defaultItem = defaultItem;
    this.generatedFlag = generatedFlag;
    this.type = type;
    this.unionEnum = unionEnum;
    this.name = name;
    this.optionalUnion = optionalUnion;
    this.values = values;

    validatePartialCombinations();
  }

  private ApiUnionFieldDTO(ApiUnionFieldDTOBuilder builder) {
    this.defaultItem = builder.defaultItem;
    this.generatedFlag = builder.generatedFlag;
    this.type = builder.type;
    this.unionEnum = builder.unionEnum;
    this.name = builder.name;
    this.optionalUnion = builder.optionalUnion;
    this.values = builder.values;

    validatePartialCombinations();
  }

  public static class ApiUnionFieldDTOBuilder {

    private Object defaultItem;
    private Boolean generatedFlag;
    private String type;
    private UnionEnum unionEnum;
    private String name;
    private Boolean optionalUnion;
    private List<ApiTypeArrayDTO> values = new ArrayList<ApiTypeArrayDTO>();

    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder defaultItem(Object defaultItem) {
      this.defaultItem = defaultItem;
      return this;
    }

    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder generatedFlag(Boolean generatedFlag) {
      this.generatedFlag = generatedFlag;
      return this;
    }

    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder type(String type) {
      this.type = type;
      return this;
    }
    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder unionEnum(UnionEnum unionEnum) {
      this.unionEnum = unionEnum;
      return this;
    }

    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder optionalUnion(Boolean optionalUnion) {
      this.optionalUnion = optionalUnion;
      return this;
    }
    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder values(List<ApiTypeArrayDTO> values) {
      if (!values.isEmpty()) {
        this.values.addAll(values);
      }
      return this;
    }

    public ApiUnionFieldDTO.ApiUnionFieldDTOBuilder value(ApiTypeArrayDTO value) {
      if (value != null) {
        this.values.add(value);
      }
      return this;
    }

    public ApiUnionFieldDTO build() {
      ApiUnionFieldDTO apiUnionFieldDTO = new ApiUnionFieldDTO(this);
      return apiUnionFieldDTO;
    }
  }

  /**
  * Get defaultItem
  * @return defaultItem
  */
  @Schema(name = "defaultItem", required = false)
  public Object getDefaultItem() {
    return defaultItem;
  }
  public void setDefaultItem(Object defaultItem) {
    this.defaultItem = defaultItem;
  }

  /**
  * Get generatedFlag
  * @return generatedFlag
  */
  @Schema(name = "generatedFlag", required = false)
  public Boolean getGeneratedFlag() {
    return generatedFlag;
  }
  public void setGeneratedFlag(Boolean generatedFlag) {
    this.generatedFlag = generatedFlag;
  }

  /**
  * Get type
  * @return type
  */
  @Schema(name = "type", required = false)
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
  * Get unionEnum
  * @return unionEnum
  */
  @Schema(name = "unionEnum", required = false)
  public UnionEnum getUnionEnum() {
    return unionEnum;
  }
  public void setUnionEnum(UnionEnum unionEnum) {
    this.unionEnum = unionEnum;
  }

  /**
  * Get name
  * @return name
  */
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
  * Get optionalUnion
  * @return optionalUnion
  */
  @Schema(name = "optionalUnion", required = false)
  public Boolean getOptionalUnion() {
    return optionalUnion;
  }
  public void setOptionalUnion(Boolean optionalUnion) {
    this.optionalUnion = optionalUnion;
  }

  /**
  * Get values
  * @return values
  */
  @Schema(name = "values", required = false)
  public List<ApiTypeArrayDTO> getValues() {
    return values;
  }
  public void setValues(List<ApiTypeArrayDTO> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUnionFieldDTO apiUnionFieldDTO = (ApiUnionFieldDTO) o;
    return Objects.equals(this.defaultItem, apiUnionFieldDTO.defaultItem) && Objects.equals(this.generatedFlag, apiUnionFieldDTO.generatedFlag) && Objects.equals(this.type, apiUnionFieldDTO.type) && Objects.equals(this.unionEnum, apiUnionFieldDTO.unionEnum) && Objects.equals(this.name, apiUnionFieldDTO.name) && Objects.equals(this.optionalUnion, apiUnionFieldDTO.optionalUnion) && Objects.equals(this.values, apiUnionFieldDTO.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultItem, generatedFlag, type, unionEnum, name, optionalUnion, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUnionFieldDTO {\n");
    sb.append(" defaultItem: ").append(toIndentedString(defaultItem)).append("\n");
    sb.append(" generatedFlag: ").append(toIndentedString(generatedFlag)).append("\n");
    sb.append(" type: ").append(toIndentedString(type)).append("\n");
    sb.append(" unionEnum: ").append(toIndentedString(unionEnum)).append("\n");
    sb.append(" name: ").append(toIndentedString(name)).append("\n");
    sb.append(" optionalUnion: ").append(toIndentedString(optionalUnion)).append("\n");
    sb.append(" values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
  * Convert the given object to string with each line indented by 4 spaces
  * (except the first line).
  */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n ");
  }

  private void validatePartialCombinations() {
    boolean satisfiedCondition = false;

    if (Objects.nonNull(this.defaultItem)) {
      satisfiedCondition = true;
    } else if (Objects.nonNull(this.generatedFlag)) {
      satisfiedCondition = true;
    } else if (Objects.nonNull(this.type)) {
      satisfiedCondition = true;
    } else if (Objects.nonNull(this.unionEnum)) {
      satisfiedCondition = true;
    } else if (Objects.nonNull(this.name)) {
      satisfiedCondition = true;
    } else if (Objects.nonNull(this.optionalUnion)) {
      satisfiedCondition = true;
    } else if (Objects.nonNull(this.values)) {
      satisfiedCondition = true;
    }

    if (!satisfiedCondition) {
      throw new ModelClassException("ApiUnionFieldDTO");
    }
  }


}