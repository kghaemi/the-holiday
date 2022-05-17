package kg.vacay.houseswap;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private int age; //must be at least 18 years old
    private String firstName;
    private String surName;
    private int userID;
    private String groupName;
    private int groupID;
    private Accommodation accommodation;
}
