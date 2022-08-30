package guru.qa.domain;


public class HamDescription {
    private String name;
    private String meat;
    private Integer weight;
    private String[] sorts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String[]  getSorts() {
        return sorts;
    }

    public void setSorts(String[]  sorts) {
        this.sorts = sorts;
    }
}

