package decorator.demo2;

public class DressTrousers implements IDressing {

    private IDressing id;
    public DressTrousers(IDressing id){
        this.id=id;
    }

    public DressTrousers() {
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
        clothing +="穿上裤子";
        p.setClothing(clothing);
        System.out.println("穿上裤子");
        if(id!=null){
            id.dress(p);
        }
    }
}
