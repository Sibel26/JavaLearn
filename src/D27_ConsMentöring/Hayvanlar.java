package D27_ConsMentöring;

public class Hayvanlar {


        String tur ;
        int hyvnId ;
        String isim ;

        public Hayvanlar() {
        }

        public Hayvanlar(String tur, int hyvnId, String isim) {
            this.tur = tur;
            this.hyvnId = hyvnId;
            this.isim = isim;
        }

        @Override
        public String toString() {
            return "Hayvanlar{" +
                    "tur='" + tur + '\'' +
                    ", hyvnId=" + hyvnId +
                    ", isim='" + isim + '\'' +
                    '}';



}
}
