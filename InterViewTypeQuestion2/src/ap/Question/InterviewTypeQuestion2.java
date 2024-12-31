package ap.Question;

import java.util.HashSet;
import java.util.Set;

/* " In a company 35 employees work under 1 manager. 
 * WAP to return the dates where all employees are present in a month (1-30)." */
public class InterviewTypeQuestion2 {

    Set<Integer> findAllPresent(Set<Integer> commonPresence, int days) {
        // Print days in the common presence set
        for (int day = 1; day <= days; day++) {
            if (commonPresence.contains(day)) {
                System.out.println(day);
                /*Checks if the current day is not in the absences set 
                 * means no employees are absent on that day).*/
            }
        }
        return commonPresence; 
        //Returns the set of days when all employees are present.
    }

    public static void main(String[] args) {
        int days = 30; // ---> Total days in the month(30/31)
        int employees = 35; // Total number of employees(n no of employee)

        // Simulate present days for all employees
        Set<Integer> employee1 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 18));
        Set<Integer> employee2 = new HashSet<>(Set.of(7, 8, 9, 10, 11, 12, 18));
        Set<Integer> employee3 = new HashSet<>(Set.of(7, 13, 14, 15, 16, 17, 18));

        /* Find common present days
         * Updates commonPresentDays to retain only the days that are common with employee2 &
         * employee3 or we say this steps perform intersection between employee1 and employee2
         * and employee 3. */ 
        Set<Integer> commonPresence = new HashSet<>(employee1);
        commonPresence.retainAll(employee2);
        commonPresence.retainAll(employee3);

        // Create an object and call the findAllPresent method
        InterviewTypeQuestion2 obj = new InterviewTypeQuestion2();
        System.out.println("days when all employees are present:");
        obj.findAllPresent(commonPresence, days);
    }
}
