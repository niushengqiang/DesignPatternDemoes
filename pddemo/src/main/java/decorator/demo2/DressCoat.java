package decorator.demo2;

public class DressCoat implements IDressing {
    private IDressing id;
    public DressCoat(IDressing id){
        this.id=id;
    }

    public DressCoat() {
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
        clothing +="穿上外套";
        p.setClothing(clothing);
        System.out.println("穿上外套");
        if(id!=null){
            id.dress(p);
        }
    }
}
