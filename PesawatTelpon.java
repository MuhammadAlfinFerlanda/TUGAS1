public class PesawatTelpon {
    String listrik, kabel, keypad;

    public void setListrik(String listrik) {
        this.listrik = listrik;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    public void setKeypad(String keypad) {
        this.keypad = keypad;
    }

    public String getListrik() {
        return listrik;
    }

    public String getKabel() {
        return kabel;
    }

    public String getKeypad() {
        return keypad;
    }

    void bunyi_telepon(){ 
        System.out.println("kring kring");
    }
    
    void angkat_telepon(String Halo){ 
        System.out.println(Halo + ", ada yang bisa kami bantu?");
    }
}
