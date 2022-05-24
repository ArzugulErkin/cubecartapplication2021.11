package test.databasetest;

public class CategoryObject {
    //cat_name,cat_desc,cat_parent_id,per_int_ship,hide,seo_meta_title,seo_meta_description," +
    //                "seo_meta_keywords,priority,status
    private String cat_name;
    private String cat_desc;
    private int catParentId;
    private int cat_image;
    private double perIntShip;
    private int hide;
    private String seoMetatitle;
    private String seoMetaDescription;
    private String seoMetaKeywords;
    private int priority;
    private int status;

    public CategoryObject(String cat_name, String cat_desc, int catParentId, int cat_image,double perIntShip, int hide, String seoMetatitle, String seoMetaDescription, String seoMetaKeywords, int priority, int status) {
        this.cat_name = cat_name;
        this.cat_desc = cat_desc;
        this.catParentId = catParentId;
        this.cat_image=cat_image;
        this.perIntShip = perIntShip;
        this.hide = hide;
        this.seoMetatitle = seoMetatitle;
        this.seoMetaDescription = seoMetaDescription;
        this.seoMetaKeywords = seoMetaKeywords;
        this.priority = priority;
        this.status = status;
    }

    public int getCat_image() {
        return cat_image;
    }

    public String getCat_name() {
        return cat_name;
    }

    public String getCat_desc() {
        return cat_desc;
    }

    public int getCatParentId() {
        return catParentId;
    }

    public double getPerIntShip() {
        return perIntShip;
    }

    public int getHide() {
        return hide;
    }

    public String getSeoMetatitle() {
        return seoMetatitle;
    }

    public String getSeoMetaDescription() {
        return seoMetaDescription;
    }

    public String getSeoMetaKeywords() {
        return seoMetaKeywords;
    }

    public int getPriority() {
        return priority;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "CategoryObject{" +
                "cat_name='" + cat_name + '\'' +
                ", cat_desc='" + cat_desc + '\'' +
                ", catParentId=" + catParentId +
                ", perIntShip=" + perIntShip +
                ", hide=" + hide +
                ", seoMetatitle='" + seoMetatitle + '\'' +
                ", seoMetaDescription='" + seoMetaDescription + '\'' +
                ", seoMetaKeywords='" + seoMetaKeywords + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}

