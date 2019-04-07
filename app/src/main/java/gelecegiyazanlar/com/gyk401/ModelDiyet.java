package gelecegiyazanlar.com.gyk401;

public class ModelDiyet {

    String diyetAdi;
    int diyetKalori;
    int resimId;

    public ModelDiyet(String diyetAdi, int diyetKalori, int resimId) {
        this.diyetAdi = diyetAdi;
        this.diyetKalori = diyetKalori;
        this.resimId = resimId;
    }

    public String getDiyetAdi() {
        return diyetAdi;
    }

    public void setDiyetAdi(String diyetAdi) {
        this.diyetAdi = diyetAdi;
    }

    public int getDiyetKalori() {
        return diyetKalori;
    }

    public void setDiyetKalori(int diyetKalori) {
        this.diyetKalori = diyetKalori;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }
}
