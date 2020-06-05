package com.tobiassteely.tobiasapi.command.type.legacy;

import com.tobiassteely.tobiasapi.api.manager.ManagerObject;

public class LegacyCommand extends ManagerObject {

    private String[] activators;
    private String module;
    private String description;
    private String usage;
    private int staffLevel;

    public LegacyCommand(String name, String[] activators, String module, String description, String usage, int staffLevel) {
        super(name);
        this.activators = activators;
        this.module = module;
        this.description = description;
        this.usage = usage;
        this.staffLevel = staffLevel;
    }

    public String getName() {
        return getKey();
    }

    public String getDescription() {
        return description;
    }

    public String[] getActivators() {
        return activators;
    }

    public String getModule() {
        return module;
    }

    public int getStaffLevel() {
        return staffLevel;
    }

    public String getUsage() {
        return usage;
    }

    public void setActivators(String[] activators) {
        this.activators = activators;
    }

    public boolean run(String[] args) {
        return false; // OVERRIDE
    }

}
