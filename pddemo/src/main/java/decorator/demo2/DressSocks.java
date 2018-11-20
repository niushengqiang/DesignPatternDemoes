package decorator.demo2;

public class DressSocks implements IDressing {
    private IDressing id;
    public DressSocks(IDressing id){
        this.id=id;
    }

    public DressSocks() {
    }

    public IDressing getId() {
        return id;
    }

    public void setId(IDressing id) {
        this.id = id;
    }

    @Override
    public void dress(Person p) {
        String clothing = p.getClothing();
        clothing +="穿上袜子";
        p.setClothing(clothing);
        System.out.println("穿上袜子");
        if(id!=null){
            id.dress(p);
        }
    }
}
