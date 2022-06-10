package test.cubecartrestassuredapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryPayload {
    @JsonProperty("catDescription")
    private String catDescription;
    @JsonProperty("catImage")
    private int catImage;
    @JsonProperty("catName")
    private String catName;
    @JsonProperty("catParentId")
    private int catParentId;
    @JsonProperty("status")
    private int status;

    public CategoryPayload(String catDescription, int catImage, String catName, int catParentId, int status) {
        this.catDescription = catDescription;
        this.catImage = catImage;
        this.catName = catName;
        this.catParentId = catParentId;
        this.status = status;
    }
}
