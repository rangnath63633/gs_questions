package org.ranga.gs_coderpad_questions;

/*
Given the string (containing directions e.g., U, R, D, L) and initial coordinates (0,0),
return the final coordinates after traversing the string.

Examples:
Given (0,0) and String - "UUU"
    Answer : (0,3)

Given (0,0) and String - "URRDDL"
    Answer : (1,-1)

Additional testcase : String - "DOWN UP 2xRIGHT DOWN 3xLEFT"
    Answer : (-1,-1)
 */

public class Direction {
    public static void main(String[] args) {
        int[] result = findFinalCoordinates("UUU");
        System.out.println("(" + result[0] + "," + result[1] + ")"); // (0, 3)

        int[] result1 = findFinalCoordinates("URRDDL");
        System.out.println("(" + result1[0] + "," + result1[1] + ")"); // (1, -1)

        int[] result2 = findFinalCoordinates("DOWN UP 2xRIGHT DOWN 3xLEFT");
        System.out.println("(" + result2[0] + "," + result2[1] + ")"); // (-1, -1)
    }

    public static int[] findFinalCoordinates(String directions) {
        String[] commands = directions.split(" ");
        System.out.println(commands.length);
            if(commands.length == 1) {
                commands = directions.split("");
            }
            int x = 0, y=0;
            for (String command : commands) {
                if (command.contains("x")) {
                    String[] parts = command.split("x");
                    int multiplier = Integer.parseInt(parts[0]);
                    String direction = parts[1].toUpperCase();

                    for (int i = 0; i < multiplier; i++) {
                        switch (direction) {
                            case "UP":
                                y++;
                                break;
                            case "DOWN":
                                y--;
                                break;
                            case "LEFT":
                                x--;
                                break;
                            case "RIGHT":
                                x++;
                                break;
                        }
                    }
                } else {
                    switch (command) {
                        case "U":
                            y++;
                            break;
                        case "D":
                            y--;
                            break;
                        case "L":
                            x--;
                            break;
                        case "R":
                            x++;
                            break;
                        case "UP":
                            y++;
                            break;
                        case "DOWN":
                            y--;
                            break;
                        case "LEFT":
                            x--;
                            break;
                        case "RIGHT":
                            x++;
                            break;
                    }
                }
            }

            return new int[]{x, y};
        }

}

