
public class Vache implements Animal {
    private LaVache laVache;

    public Vache(LaVache laVache) {
        this.laVache = laVache;
    }

    @Override
    public void forme() {
        laVache.formeVache();
    }

    @Override
    public void cri() {
        laVache.criVache();
    }
}

