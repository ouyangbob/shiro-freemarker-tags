package com.jagregory.shiro.freemarker;

/**
 * @author ouyang
 * @Description
 * @date 2019/11/20
 */
public class HasAnyPermissionsTag extends PermissionTag {
    private static final String PERMISSION_NAMES_DELIMETER = ",";

    public HasAnyPermissionsTag() {
    }

    protected boolean showTagBody(String p) {
        String[] perNames=p.split(PERMISSION_NAMES_DELIMETER);
        for (String perName : perNames) {
            if (this.isPermitted(perName)) {
                return true;
            }
        }
        return false;
    }
}
