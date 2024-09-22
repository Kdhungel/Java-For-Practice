package OOPS.Encapsulation.AccessModifier;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("Kritish");
//        System.out.println(s.getName());
        Account acc = new Account();
        acc.setAcc_no(245645654);
        acc.setName("Kritish");
        acc.setEmail("k@k.com");
        acc.setAmount(34453432f);

        System.out.println(acc.getName()+" "+ acc.getEmail()+ " "+ acc.getAcc_no()+ " "+ acc.getAmount());
    }
}
