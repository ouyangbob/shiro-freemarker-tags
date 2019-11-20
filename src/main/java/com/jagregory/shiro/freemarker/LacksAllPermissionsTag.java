package com.jagregory.shiro.freemarker;

/**
 * <p>Equivalent to {@link org.apache.shiro.web.tags.LacksPermissionTag}</p>
 */
public class LacksAllPermissionsTag extends PermissionTag {

    private static final String PERMISSION_NAMES_DELIMETER = ",";

    protected boolean showTagBody(String p) {
        String[] perNames=p.split(PERMISSION_NAMES_DELIMETER);
        for (String perName : perNames) {
            if (this.isPermitted(perName)) {
                return false;
            }
        }
        return true;
    }
}
