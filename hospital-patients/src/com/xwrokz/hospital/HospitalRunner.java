package com.xwrokz.hospital;

import com.xwrokz.hospital.dto.PatientDto;
import com.xwrokz.hospital.hospital.Hospital;
import com.xwrokz.hospital.hospital.impl.HospitalImpl;

import java.util.Scanner;


public class HospitalRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of patients to admit: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Hospital hospital = new HospitalImpl(size);

        for (int i = 0; i < size; i++) {
            PatientDto dto = new PatientDto();

            System.out.println("\nEnter details for patient " + (i + 1));

            System.out.print("ID: ");
            dto.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Name: ");
            dto.setName(scanner.nextLine());

            System.out.print("Age: ");
            dto.setAge(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Address: ");
            dto.setAddress(scanner.nextLine());

            System.out.print("Disease: ");
            dto.setDisease(scanner.nextLine());

            System.out.print("Doctor Assigned: ");
            dto.setDoctorAssigned(scanner.nextLine());

            System.out.print("Phone Number: ");
            dto.setPhoneNumber(scanner.nextLong());
            scanner.nextLine();

            System.out.print("Email: ");
            dto.setEmail(scanner.nextLine());

            boolean admitted = hospital.admitPatient(dto);
            if (!admitted) {
                System.out.println("Failed to admit patient.");
            }
        }

        String input;
        do {
            System.out.println("\n--- Hospital Menu ---");
            System.out.println("1. View All Patients");
            System.out.println("2. Get Patient Age by Name");
            System.out.println("3. Get Patient Address by Name");
            System.out.println("4. Get Patient Name by Phone/Email");
            System.out.println("5. Update Patient Age by ID");
            System.out.println("6. Get Disease by Patient Name");
            System.out.println("7. Get Doctor Assigned by Patient Name");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    hospital.getAllPatients();
                    break;
                case 2:
                    System.out.print("Enter Patient Name: ");
                    System.out.println("Age: " + hospital.getPatientAgeByName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter Patient Name: ");
                    System.out.println("Address: " + hospital.getPatientAddressByName(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Enter Phone Number or Email: ");
                    System.out.println("Name: " + hospital.getPatientNameByPhoneNumberOrEmail(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print("Enter Patient ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter New Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    boolean updated = hospital.updatePatientAgeById(id, age);
                    System.out.println("Age updated: " + updated);
                    break;
                case 6:
                    System.out.print("Enter Patient Name: ");
                    System.out.println("Disease: " + hospital.getDiseaseByPatientName(scanner.nextLine()));
                    break;
                case 7:
                    System.out.print("Enter Patient Name: ");
                    System.out.println("Doctor Assigned: " + hospital.getDoctorAssignedByPatientName(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Thank you......");
        scanner.close();
    }
}
