@stories
  Feature: Sing Up on Utest
    As a user, i want to learn how automate with screenplay a form at Utest with the automation test

  @scenario1
  Scenario: Sign Up in the web site
    Given that Julian wants to learn how can login into the page
    | strFNAME | strLNAME | strEMAIL           |
    | Eduardo  | Camacho  | jeac0416@gmail.com |
    When fill in the form fields
    |strCITY                            | strZIP | strCOUNTRY | strCOMP       | strVERSION       | strLANG | strMOBILE | strMODEL     | strOS      |
    | Floridablanca Santander, Colombia | 681003 | Colombia   | Windows       | Windows 10 Home  | English | Motorola  | Moto G7 Plus | Android 10 |
    Then finish the form and click to send it
    | strPASSWD     | strCONFPASS |
    | Prueba7es7(6) | Prueba7es7(6) |