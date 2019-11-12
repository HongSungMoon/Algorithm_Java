import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Person> persons = new ArrayList<>();

        int personCount = Integer.parseInt(br.readLine());

        for(int i=0; i<personCount; i++) {

            String[] info = br.readLine().split(" ");
            int weight = Integer.parseInt(info[0]);
            int height = Integer.parseInt(info[1]);

            Person person = new Person(weight, height);
            persons.add(person);

        }

        for(int i=0; i<personCount; i++) {
            for(int j=0; j<personCount; j++) {
                if(i != j) {
                    if (persons.get(i).weight < persons.get(j).weight && persons.get(i).height < persons.get(j).height) {
                        persons.get(i).addGrade();
                    }
                }
            }
        }

        for(int i=0; i<personCount; i++)
            bw.write(persons.get(i).grade + " ");

        bw.flush();
        bw.close();

    }

    static class Person {

        int weight;
        int height;
        int grade = 1;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        void addGrade() {
            this.grade++;
        }

    }

}
