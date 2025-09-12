

    public void setPowerRole(int role) {
        int newDataRole = getDataRole();
        if (!areAllRolesSupported()) {
            switch (role) {
                case POWER_ROLE_SINK:
                    newDataRole = DATA_ROLE_DEVICE;
                    break;
                case POWER_ROLE_SOURCE:
                    newDataRole = DATA_ROLE_HOST;
                    break;
                default:
                    newDataRole = DATA_ROLE_NONE;
            }
        }
        if (mPort != null) {
            mPort.setRoles(role, newDataRole);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\Resurrection_packages_apps_Settings\src\com\android\settings\connecteddevice\usb\UsbBackend.java 81894
========================================================

    public void setDataRole(int role) {
        int newPowerRole = getPowerRole();
        if (!areAllRolesSupported()) {
            switch (role) {
                case DATA_ROLE_DEVICE:
                    newPowerRole = POWER_ROLE_SINK;
                    break;
                case DATA_ROLE_HOST:
                    newPowerRole = POWER_ROLE_SOURCE;
                    break;
                default:
                    newPowerRole = POWER_ROLE_NONE;
            }
        }
        if (mPort != null) {
            mPort.setRoles(newPowerRole, role);
        }
    }


D:\_python\clone\CloneClassification\data_new\android\Resurrection_packages_apps_Settings\src\com\android\settings\connecteddevice\usb\UsbBackend.java 81895
========================================================
