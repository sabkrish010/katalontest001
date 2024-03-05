<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>Contains all exisiting test suites set to ran against 4 test sites</description>
   <name>_User Management (Test Suite Collection)</name>
   <tag>User Management</tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>Clue Release</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome (headless)</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Core Functionality/Options/User Management/Navigate to User Management</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>Clue Release</profileName>
            <requireConfigurationData>false</requireConfigurationData>
            <runConfigurationId>Chrome (headless)</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Core Functionality/Options/User Management/Quick Search From User Management</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
