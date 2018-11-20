package decorator.demo2;

public class DressUnderpants implements IDressing {
    private IDressing id;
    public DressUnderpants(IDressing id){
        this.id=id;
    }

    public DressUnderpants() {
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
        clothing +="穿上内裤";
        p.setClothing(clothing);
        System.out.println("穿上内裤");
        if(id!=null){
            id.dress(p);
        }
    }
}
