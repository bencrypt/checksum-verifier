package org.example.model;

public enum Checksum {

    /*==================================================*
     *==                ENUM VALUES                   ==*
     *==================================================*/

    MD5("MD5"),
    SHA1("SHA1"),
    SHA256("SHA-256"),
    SHA512("SHA-512");

    /*==================================================*
     *==                   FIELDS                     ==*
     *==================================================*/

    private String algorithm;

    /*==================================================*
     *==                CONSTRUCTORS                  ==*
     *==================================================*/

    Checksum(String algorithm) {
        this.algorithm = algorithm;
    }

    /*==================================================*
     *==                 ACCESSORS                    ==*
     *==================================================*/

    public String getAlgorithm() {
        return algorithm;
    }
}
