package com.bluesgao.psc.model;

import org.apache.maven.artifact.repository.ArtifactRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MavenInfo {
    private String groupId;
    private String baseDir;
    private String resources;
    private String outDirectory;
    private String testResources;
    private String testOutDirectory;
    private ArtifactRepository localRepository;
    private List<ArtifactRepository> remoteRepository;
    private Map<String, String> configuration = new HashMap<String, String>();

    public MavenInfo(String baseDir, String resources, String outDirectory, String testResources, String testOutDirectory, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepository) {
        this.baseDir = baseDir;
        this.resources = resources;
        this.outDirectory = outDirectory;
        this.testResources = testResources;
        this.testOutDirectory = testOutDirectory;
        this.localRepository = localRepository;
        this.remoteRepository = remoteRepository;
    }

    public MavenInfo() {
    }

    public MavenInfo(String groupId, String baseDir, String resources, String outDirectory, String testResources, String testOutDirectory, ArtifactRepository localRepository, List<ArtifactRepository> remoteRepository) {
        this.groupId = groupId;
        this.baseDir = baseDir;
        this.resources = resources;
        this.outDirectory = outDirectory;
        this.testResources = testResources;
        this.testOutDirectory = testOutDirectory;
        this.localRepository = localRepository;
        this.remoteRepository = remoteRepository;
    }

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getOutDirectory() {
        return outDirectory;
    }

    public void setOutDirectory(String outDirectory) {
        this.outDirectory = outDirectory;
    }

    public String getTestResources() {
        return testResources;
    }

    public void setTestResources(String testResources) {
        this.testResources = testResources;
    }

    public String getTestOutDirectory() {
        return testOutDirectory;
    }

    public void setTestOutDirectory(String testOutDirectory) {
        this.testOutDirectory = testOutDirectory;
    }

    public ArtifactRepository getLocalRepository() {
        return localRepository;
    }

    public void setLocalRepository(ArtifactRepository localRepository) {
        this.localRepository = localRepository;
    }

    public List<ArtifactRepository> getRemoteRepository() {
        return remoteRepository;
    }

    public void setRemoteRepository(List<ArtifactRepository> remoteRepository) {
        this.remoteRepository = remoteRepository;
    }

    public Map<String, String> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "MavenInfo{" +
                "groupId='" + groupId + '\'' +
                ", baseDir='" + baseDir + '\'' +
                ", resources='" + resources + '\'' +
                ", outDirectory='" + outDirectory + '\'' +
                ", testResources='" + testResources + '\'' +
                ", testOutDirectory='" + testOutDirectory + '\'' +
                ", localRepository=" + localRepository +
                ", remoteRepository=" + remoteRepository +
                ", configuration=" + configuration +
                '}';
    }
}
