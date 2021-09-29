public class Gradina {
        private String nume;
        private Planta plants[];
        private String proprietar;
        public double review;
        public double size;
        public int n;

        public Gradina(String nume, String proprietar){
            this.nume = nume;
            this.proprietar = proprietar;
        }

        public Gradina(int n){
                for(int i = 0; i<n;i++)
                {
                        plants[i] = new Planta();
                }
        }

        public void getNume()
        {
                System.out.println("Numele gradinii este: " + this.nume);
        }

        public void getProprietar()
        {
                System.out.println("Proprietarul gradinii este: " + this.proprietar);
        }

        public void setNume(String nume)
        {
                this.nume= nume;
                System.out.println("Noul nume al gradinii este: " + this.nume);
        }

        public void setProprietar(String nume)
        {
                this.proprietar= nume;
                System.out.println("Noul proprietar al gradinii este: " + this.proprietar);
        }






}
