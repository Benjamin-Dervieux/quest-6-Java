class ClassRoom {

        public static void main(String[] args) {
            Wilder marco = new Wilder("Marco", true);
            Wilder god = new Wilder("God", false);

            System.out.println("1. Je m'appelle : " + marco.getFirstname()  + marco.firstnameAndAge());
            System.out.println("2. Je m'appelle : " + god.getFirstname() + god.firstnameAndAge());

        }

}
