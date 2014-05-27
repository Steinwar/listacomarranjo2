package listacomarranjo;

public class App {

    public static void main(String[] args) {
        ListTAD<String> lista = new ListArray<>();
        lista.add("Gato");
        lista.add("Cachorro");
        lista.add("Tigre");
        lista.add("Pato");
        lista.add("Rato");
        lista.add(0, "Elefante");
        lista.add("Pássaro");
       
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }

        System.out.println("Primeiro caractere da primeira palavra: "
                + ((String) lista.get(0)).charAt(0));

        System.out.println("indexOf Tigre = " + lista.indexOf("Tigre"));
    }

}
