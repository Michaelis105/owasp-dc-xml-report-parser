package com.owaspdcxmlp;

/**
 * An OWASP Dependency Check dependency.
 */
public class Dependency {
    String name;
    String severity;
    String[] vulnerabilities;
    int evidenceCount;
    int cveCount;
    // TODO: There are more traits defining dependency.

    /**
     * All dependencies must have at a minimum a dependency name, designated severity level,
     * and a list of vulnerabilities associated with dependency.
     * @param depName Name of dependency as identified by OWASP-DC
     * @param sev Severity level as defined by OWASP-DC
     * @param vuls List of vulnerability names
     */
    Dependency(String depName, String sev, String[] vuls) {
        name = depName;
        severity = sev;
        vulnerabilities = vuls;
    }

    // TODO: Code getters/setters

}
