Feature: checking the functanilities of www.Xenonstack.com

  @logoNavigation
  Scenario: Checking logo is clickable
    When Click the logo
    Then Go to Homepage

  @search
  Scenario: checking search functionality
    When Click on search and Enter Something
    Then Show some result

  @navigation
  Scenario Outline: Checking Navigation links
    When Hover on Services
    When Click on "<service>"
    Then Go to "<service-page>"

    Examples:
      | service                         | service-page|
    # XS Discover
      |Enterprise Data Strategy         |Big Data Consulting Services and Solutions - Real Time Data Company |
      |Custom Software Development      |Custom Software Development and Engineering Services           |
      |Platform Engineering             |Digital Platform Engineering and Development Services          |
      |Enterprise DevOps                |Enterprise Cloud and DevOps Solutions Implementation Company   |
      |Intelligent Enterprise Automation|Connected Intelligent Enterprise Solutions Company |
      |Digital Experience Platform      |User Experience (UX) Design Services and Consulting Solutions|
    # XS Optimise
      |Cloud Migration                  | Cloud Migration Services and Solutions - Cloud Engineering Company|
      |Application Modernization        |Application Modernization Services, Strategy and Solutions         |
      |Cloud Infrastructure             |Cloud Infrastructure and Engineering Services and Solution Company |
      |Data Warehouse                   |Data Warehouse Consulting Services and Solutions |
      |Internet of Things               |Industrial IoT (IIoT) Services and Solutions |
      |Business Intelligence            |Business Intelligence Consulting Services and Solutions - BI Company|