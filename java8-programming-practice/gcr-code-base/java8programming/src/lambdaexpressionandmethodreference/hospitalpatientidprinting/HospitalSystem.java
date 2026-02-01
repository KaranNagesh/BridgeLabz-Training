package lambdaexpressionandmethodreference.hospitalpatientidprinting;

import java.util.*;

public class HospitalSystem {

    public static void main(String[] args) {

        List<Integer> patientIds =
                Arrays.asList(101, 102, 103, 104, 105);

   
        patientIds.forEach(System.out::println);
    }
}
