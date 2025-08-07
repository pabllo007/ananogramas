package anagramas.service.equalsHashCode;

public class console {

    public static void main(String[] args) {

        /***
         * Utilização de Record para dados imutaveis
         */
        EqualsHashCodeRecord e1 = new EqualsHashCodeRecord("123", "Contrato de TI");
        EqualsHashCodeRecord e2 = new EqualsHashCodeRecord("123", "Contrato de TI");

        System.out.println("Equals são iguais: " + e1.equals(e2));

        e2 = new EqualsHashCodeRecord("1234", "Contrato de TI");

        System.out.println("Objetos são iguais: " + e1.equals(e2));

    }
}
