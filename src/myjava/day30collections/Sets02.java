package myjava.day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {

	public static void main(String[] args) {
		
		//Ex 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.

        //1. yol: TreeSet eleman eklemede cok yavastir.Her bir elemani eklerken siralama yapar.
        //her eleman eklendiginde siralama yapar o yuzden yavas calisir
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");
        System.out.println(emails);

        //2. way: Bu daha hizli calisir.
        //TreeSet i en sona ekledigimiz icin bir kere siralama yapar
        HashSet<String> emaisHs = new HashSet<>();
        emaisHs.add("abc@gmail.com");
        emaisHs.add("abd@gmail.com");
        emaisHs.add("abe@gmail.com");
        emaisHs.add("abf@gmail.com");
        emaisHs.add("abg@gmail.com");
        emaisHs.add("abh@gmail.com");
        emaisHs.add("abi@gmail.com");
        emaisHs.add("abj@gmail.com");
        emaisHs.add("abk@gmail.com");
        emaisHs.add("abl@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emaisHs);
        System.out.println(emailsHsTs);

		

	}

}
