package advanced.jakub;

import java.util.HashMap;

public class Constants
{

    public final static String[] QUESTIONS = {"Under the shared responsibility model, which of the following is the customer responsible for?",
            "The use of what AWS feature or service allows companies to track and categorize spending on a detailed level?",
    "Which service stores objects, provides real-time access to those objects, and offers versioning and lifecycle capabilities?",
    "What AWS team assists customers with accelerating cloud adoption through paid engagements in any of several specialty practice areas?",
    "A customer would like to design and build a new workload on AWS Cloud but does not have the AWS-related software technical expertise in-house.\n" +
            "    Which of the following AWS programs can a customer take advantage of to achieve that outcome?", // 5
    "Distributing workloads across multiple Availability Zones supports which cloud architecture design principle?",
    "Which AWS services can host a Microsoft SQL Server database? (Choose two.)",
    "Which of the following inspects AWS environments to find opportunities that can save money for users and also improve system performance?",
    "Which of the following Amazon EC2 pricing models allow customers to use existing server-bound software licenses?",
    "Which AWS characteristics make AWS cost effective for a workload with dynamic user demand? (Choose two.)",  // 10 to be getten from file or something here
    "Which service enables risk auditing by continuously monitoring and logging account activity, including user actions in the AWS Management Console and AWS SDKs?",
    "Which of the following are characteristics of Amazon S3? (Choose two.)",
    "Which services can be used across hybrid AWS Cloud architectures? (Choose two.)",
    "What costs are included when comparing AWS Total Cost of Ownership (TCO) with on-premises TCO?",
    "A company is considering using AWS for a self-hosted database that requires a nightly shutdown for maintenance and cost-saving purposes.\n" +
            "Which service should the company use?", //15
    "Which of the following is a correct relationship between regions, Availability Zones, and edge locations?",
    "Which AWS tools assist with estimating costs? (Choose three.)",
    "Which of the following are advantages of AWS consolidated billing? (Choose two.)",
    "Which of the following Reserved Instance (RI) pricing models provides the highest average savings compared to On-Demand pricing?",
    "Compared with costs in traditional and virtualized data centers, AWS has:", // 20
            "A characteristic of edge locations is that they:", // 21
            "Which of the following can limit Amazon Storage Service (Amazon S3) bucket access to specific users?",
            "Which of the following security-related actions are available at no cost?",
            "Which of the Reserved Instance (RI) pricing models can change the attributes of the RI as long as the exchange results in the creation of RIs of equal or greater value?",
            "Which AWS feature will reduce the customerג€™s total cost of ownership (TCO)?", //25
            "Which of the following services will automatically scale with an expected increase in web traffic?",
            "Where are AWS compliance documents, such as an SOC 1 report, located?",
            "Under the AWS shared responsibility model, which of the following activities are the customerג€™s responsibility? (Choose two.)",
            "Which is a recommended pattern for designing a highly available architecture on AWS?",
            "According to best practices, how should an application be designed to run in the AWS Cloud?", // 30
            "AWS supports which of the following methods to add security to Identity and Access Management (IAM) users? (Choose two.)",
            "Which AWS services should be used for read/write of constantly changing data? (Choose two.)",
            "What is one of the advantages of the Amazon Relational Database Service (Amazon RDS)?",
            "A customer needs to run a MySQL database that easily scales.\n" +
                    "Which AWS service should they use?",
            "Which of the following components of the AWS Global Infrastructure consists of one or more discrete data centers interconnected through low latency links?", // 35
            "Which of the following is a shared control between the customer and AWS?",
            "How many Availability Zones should compute resources be provisioned across to achieve high availability?",
            "One of the advantages to moving infrastructure from an on-premises data center to the AWS Cloud is:",
            "What is the lowest-cost, durable storage option for retaining database backups for immediate retrieval?",
            "Which AWS IAM feature allows developers to access AWS services through the AWS CLI?", //40
            "Which of the following is a fast and reliable NoSQL database service?",
            "What is an example of agility in the AWS Cloud?",
            "Which service should a customer use to consolidate and centrally manage multiple AWS accounts?",
            "What approach to transcoding a large number of individual video files adheres to AWS architecture principles?",
            "For which auditing process does AWS have sole responsibility?", //45
            "Which feature of the AWS Cloud will support an international companyג€™s requirement for low latency to all of its customers?",
            "Which of the following is the customerג€™s responsibility under the AWS shared responsibility model?",
            "A customer is using multiple AWS accounts with separate billing.\n" +
                    "How can the customer take advantage of volume discounts with minimal impact to the AWS resources?",
            "Which of the following are features of Amazon CloudWatch Logs? (Choose two.)",
            "Which of the following is an AWS managed Domain Name System (DNS) web service?", // 50?
            "A customer is deploying a new application and needs to choose an AWS Region.\n" +
                    "Which of the following factors could influence the customerג€™s decision? (Choose two.)",
            "Which storage service can be used as a low-cost option for hosting static websites?",
            "Which Amazon EC2 instance pricing model can provide discounts of up to 90%?",
            "What is the AWS customer responsible for according to the AWS shared responsibility model?",
            "Which of the following AWS Cloud services can be used to run a customer-managed relational database?", //55
            "A company is looking for a scalable data warehouse solution.\n" +
                    "Which of the following AWS solutions would meet the companyג€™s needs?",
            "Which statement best describes Elastic Load Balancing?",
            "Which of the following are valid ways for a customer to interact with AWS services? (Choose two.)",
            "The AWS Cloudג€™s multiple Regions are an example of:",
            "Which of the following AWS services can be used to serve large amounts of online video content with the lowest possible latency? (Choose two.)", //60
            "Web servers running on Amazon EC2 access a legacy application running in a corporate data center.\n" +
                    "What term would describe this model?",
            "What is the benefit of using AWS managed services, such as Amazon ElastiCache and Amazon Relational Database Service (Amazon RDS)?",
            "Which service provides a virtually unlimited amount of online highly durable object storage?",
            "Which of the following Identity and Access Management (IAM) entities is associated with an access key ID and secret access key when using AWS Command\n" +
                    "Line Interface (AWS CLI)?",
            "Which of the following security-related services does AWS offer? (Choose two.)", //65
            "Which AWS managed service is used to host databases?",
            "Which AWS service provides a simple and scalable shared file storage solution for use with Linux-based AWS and on-premises servers?",
            "When architecting cloud applications, which of the following are a key design principle?",
            "Which AWS service should be used for long-term, low-cost storage of data backups?",
            "Under the shared responsibility model, which of the following is a shared control between a customer and AWS?", // 70
            "Which AWS service allows companies to connect an Amazon VPC to an on-premises data center?",
            "A company wants to reduce the physical compute footprint that developers use to run code.\n" +
                    "Which service would meet that need by enabling serverless architectures?",
            "Which AWS service provides alerts when an AWS event may impact a companyג€™s AWS resources?",
            "Which of the following are categories of AWS Trusted Advisor? (Choose two.)",
            "Which task is AWS responsible for in the shared responsibility model for security and compliance?",
            "Where should a company go to search software listings from independent software vendors to find, test, buy and deploy software that runs on AWS?",
            "Which of the following is a benefit of using the AWS Cloud?",
            "When performing a cost analysis that supports physical isolation of a customer workload, which compute hosting model should be accounted for in the Total Cost of Ownership (TCO)?",
            "Which AWS service provides the ability to manage infrastructure as code?",
            "If a customer needs to audit the change management of AWS resources, which of the following AWS services should the customer use?", // 80
            "What is Amazon CloudWatch?",
            "Which service allows a company with multiple AWS accounts to combine its usage to obtain volume discounts?",
            "Which of the following services could be used to deploy an application to servers running on-premises? (Choose two.)",
            "Which Amazon EC2 pricing model adjusts based on supply and demand of EC2 instances?",
            "Which design principles for cloud architecture are recommended when re-architecting a large monolithic application? (Choose two.)", // 85
            "Which is the MINIMUM AWS Support plan that allows for one-hour target response time for support cases?",
            "Where can AWS compliance and certification reports be downloaded?",
            "Which AWS service provides a customized view of the health of specific AWS services that power a customerג€™s workloads running on AWS?",
            "Which of the following is an advantage of consolidated billing on AWS?",
            "Which of the following steps should be taken by a customer when conducting penetration testing on AWS?", // 90
            "Which of the following AWS features enables a user to launch a pre-configured Amazon Elastic Compute Cloud (Amazon EC2) instance?",
            "How would an AWS customer easily apply common access controls to a large set of users?",
            "What technology enables compute capacity to adjust as loads change?",
            "Which AWS services are defined as global instead of regional? (Choose two.)",
            "Which AWS service would you use to obtain compliance reports and certificates?", // 95
            "Under the shared responsibility model, which of the following tasks are the responsibility of the AWS customer? (Choose two.)",
            "Which AWS service can be used to manually launch instances based on resource requirements?",
            "A company is migrating an application that is running non-interruptible workloads for a three-year time frame.\n" +
                    "Which pricing construct would provide the MOST cost-effective solution?",
            "The financial benefits of using AWS are: (Choose two.)",
            "Which AWS Cost Management tool allows you to view the most granular data about your AWS bill?", //100
            "Which of the following can an AWS customer use to launch a new Amazon Relational Database Service (Amazon RDS) cluster? (Choose two.)",
            "Which of the following is an AWS Cloud architecture design principle?",
            "Which of the following security measures protect access to an AWS account? (Choose two.)",
            "Which service provides a hybrid storage service that enables on-premises applications to seamlessly use cloud storage?",
            "Which of the following services falls under the responsibility of the customer to maintain operating system configuration, security patching, and networking?",//105
            "Which of the following is an important architectural design principle when designing cloud applications?",
            "Which AWS support plan includes a dedicated Technical Account Manager?",
            " Amazon Relational Database Service (Amazon RDS) offers which of the following benefits over traditional database management?",
            "Which service is best for storing common database query results, which helps to alleviate database access load?",
            "Which of the following is a component of the shared responsibility model managed entirely by AWS?", //110
            "Which options does AWS make available for customers who want to learn about security in the cloud in an instructor-led setting? (Choose two.)",
            "Which of the following features can be configured through the Amazon Virtual Private Cloud (Amazon VPC) Dashboard? (Choose two.)",
            "If each department within a company has its own AWS account, what is one way to enable consolidated billing?",
            "How do customers benefit from Amazon's massive economies of scale?",
            "Which AWS services can be used to gather information about AWS account activity? (Choose two.)", //115
            "Which of the following common IT tasks can AWS cover to free up company IT resources? (Choose two.)",
            "In which scenario should Amazon EC2 Spot Instances be used?",
            "Which AWS feature should a customer leverage to achieve high availability of an application?",
            "Which is the minimum AWS Support plan that includes Infrastructure Event Management without additional costs?",
            "Which AWS service can serve a static website?",//120
            "How does AWS shorten the time to provision IT resources?",
            "What can AWS edge locations be used for? (Choose two.)",
            "Which of the following can limit Amazon Simple Storage Service (Amazon S3) bucket access to specific users?",
            "A solution that is able to support growth in users, traffic, or data size with no drop in performance aligns with which cloud architecture principle?",
            "A company will be moving from an on-premises data center to the AWS Cloud.What would be one financial difference after the move?", //125
            "How should a customer forecast the future costs for running a new web application?",
            "Which is the MINIMUM AWS Support plan that provides technical support through phone calls?",
            "Which of the following tasks is the responsibility of AWS?",
            "One benefit of On-Demand Amazon Elastic Compute Cloud (Amazon EC2) pricing is:",
            "An administrator needs to rapidly deploy a popular IT solution and start using it immediately.Where can the administrator find assistance?", //130
            "Which of the following services is in the category of AWS serverless platform?",
            "Which services are parts of the AWS serverless platform?",
            "According to the AWS shared responsibility model, what is the sole responsibility of AWS?",
            "Which AWS IAM feature is used to associate a set of permissions with multiple users?",
            "Which of the following are benefits of the AWS Cloud? (Choose two.)", //135
            "Which of the following can a customer use to enable single sign-on (SSO) to the AWS Console?",
            "What are the multiple, isolated locations within an AWS Region that are connected by low-latency networks called?",
            "Which of the following benefits does the AWS Compliance program provide to AWS customers? (Choose two.)",
            "Which of the following services provides on-demand access to AWS compliance reports?",
            "As part of the AWS shared responsibility model, which of the following operational controls do users fully inherit from AWS?", //140
            "When comparing AWS Cloud with on-premises Total Cost of Ownership, which expenses must be considered? (Choose two.)",
            "Under the shared responsibility model, which of the following tasks are the responsibility of the customer? (Choose two.)",
            "Which scenarios represent the concept of elasticity on AWS? (Choose two.)",
            "When is it beneficial for a company to use a Spot Instance?",
            "A company is considering moving its on-premises data center to AWS.What factors should be included in doing a Total Cost of Ownership (TCO) analysis? (Choose two.)", //145
            "How does AWS charge for AWS Lambda?",
            "What function do security groups serve related Amazon Elastic Compute Cloud (Amazon EC2) instance security?",
            "Which disaster recovery scenario offers the lowest probability of down time?",
            "What will help a company perform a cost benefit analysis of migrating to the AWS Cloud?",
            "Which of the following provides the ability to share the cost benefits of Reserved Instances across AWS accounts?", //150
            "A company has multiple AWS accounts and wants to simplify and consolidate its billing process.Which AWS service will achieve this?",
            "A company is designing an application hosted in a single AWS Region serving end-users spread across the world. The company wants to provide the end-users low latency access to the application data.Which of the following services will help fulfill this requirement?", ///xxx, was direct connect on some websites, cloudfront on others
            "Which of the following deployment models enables customers to fully trade their capital IT expenses for operational expenses?",
            "How is asset management on AWS easier than asset management in a physical data center?",
            "What feature of Amazon RDS helps to create globally redundant databases?", //155  xxx
            "Using AWS Identity and Access Management (IAM) to grant access only to the resources needed to perform a task is a concept known as:",
            "Which methods can be used to identify AWS costs by departments? (Choose two.)", //xxxxx
            "Under the AWS shared responsibility model, customer responsibilities include which one of the following?",
            "Which managed AWS service provides real-time guidance on AWS security best practices?",
            "Which feature adds elasticity to Amazon EC2 instances to handle the changing demand for workloads?", // 160
            "Under the AWS shared responsibility model, customers are responsible for which aspects of security in the cloud? (Choose two.)",
            "Which AWS hybrid storage service enables on-premises applications to seamlessly use AWS Cloud storage through standard file-storage protocols?",
            "What is a responsibility of AWS in the shared responsibility model?",
            "Which architectural principle is used when deploying an Amazon Relational Database Service (Amazon RDS) instance in Multiple Availability Zone mode?",
            "What does it mean to grant least privilege to AWS IAM users?", //165
            "What is a benefit of loose coupling as a principle of cloud architecture design?",
            "A director has been tasked with investigating hybrid cloud architecture. The company currently accesses AWS over the public internet.Which service will facilitate private hybrid connectivity?",
            "A company's web application currently has tight dependencies on underlying components, so when one component fails the entire web application fails.Applying which AWS Cloud design principle will address the current design issue?",
            "How can a customer increase security to AWS account logons? (Choose two.)",
            "What AWS service would be used to centrally manage AWS access across multiple accounts?", //170
            "Which AWS service can a customer use to set up an alert notification when the account is approaching a particular dollar amount?",
            "What can users access from AWS Artifact?",
            "Which is the MINIMUM AWS Support plan that provides designated Technical Account Managers?",
            "Which of the following is an AWS Well-Architected Framework design principle related to reliability?",
            "Which type of AWS storage is ephemeral and is deleted when an instance is stopped or terminated?", // 175
            "What is an advantage of using the AWS Cloud over a traditional on-premises solution?",
            "Which of the following is an AWS-managed compute service?",
            "Which of the following is an important architectural principle when designing cloud applications?",
            "Which mechanism allows developers to access AWS services from application code?",
            "Which Amazon EC2 pricing model is the MOST cost efficient for an uninterruptible workload that runs once a year for 24 hours?", //180
            "Which of the following services is a MySQL-compatible database that automatically grows storage as needed?",
            "Which Amazon Virtual Private Cloud (Amazon VPC) feature enables users to connect two VPCs together?",
            "Which service's PRIMARY purpose is software version control?",
            "A company is considering migrating its applications to AWS. The company wants to compare the cost of running the workload on-premises to running the equivalent workload on the AWS platform.Which tool can be used to perform this comparison?",
            "Which AWS service provides a secure, fast, and cost-effective way to migrate or transport exabyte-scale datasets into AWS?", //185
            "Which of the following BEST describe the AWS pricing model? (Choose two.)",
            "Which load balancer types are available with Elastic Load Balancing (ELB)? (Choose two.)",
            "Why should a company choose AWS instead of a traditional data center?",
            "Which solution provides the FASTEST application response times to frequently accessed data to users in multiple AWS Regions?",
            "Which AWS service provides a self-service portal for on-demand access to AWS compliance reports?", // 190
            "Which of the following AWS services can be used to run a self-managed database?",
            "What exclusive benefit is provided to users with Enterprise Support?",
            "How can a user protect against AWS service disruptions if a natural disaster affects an entire geographic area?",
            "How does AWS MOST effectively reduce computing costs for a growing start-up company?",
            "A startup is working on a new application that needs to go to market quickly. The application requirements may need to be adjusted in the near future.Which of the following is a characteristic of the AWS Cloud that would meet this specific need?", //195
            "Which AWS Support plan provides a full set of AWS Trusted Advisor checks?",
            "Which of the following services have Distributed Denial of Service (DDoS) mitigation features? (Choose two.)",
            "When building a cloud Total Cost of Ownership (TCO) model, which cost elements should be considered for workloads running on AWS? (Choose three.)",
            "What time-savings advantage is offered with the use of Amazon Rekognition?",
            "When comparing AWS with on-premises Total Cost of Ownership (TCO), what costs are included?", // 200
            "According to the AWS shared responsibility model, what is AWS responsible for?",
            "Which service should be used to estimate the costs of running a new project on AWS?",
            "Which AWS tool will identify security groups that grant unrestricted Internet access to a limited list of ports?",
            "Which AWS service can be used to generate alerts based on an estimated monthly bill?",
            "Which Amazon EC2 pricing model offers the MOST significant discount when compared to On-Demand Instances?", //205
            "Which of the following is the responsibility of AWS?",
            "Which of the following is an advantage of using AWS?",
            "Which AWS service would a customer use with a static website to achieve lower latency and high transfer speeds?",
            "Which services manage and automate application deployments on AWS? (Choose two.)",
            "A user wants guidance on possible savings when migrating from on-premises to AWS.Which tool is suitable for this scenario?", //210
            "Which principles are used to architect applications for reliability on the AWS Cloud? (Choose two.)",
            "What tasks should a customer perform when that customer suspects an AWS account has been compromised? (Choose two.)",
            "What is an example of high availability in the AWS Cloud?",
            "Which AWS security service protects applications from distributed denial of service attacks with always-on detection and automatic inline mitigations?",
            "A company wants to monitor the CPU usage of its Amazon EC2 resources.Which AWS service should the company use?", //215
            "What is an AWS Identity and Access Management (IAM) role?",
            "What are the advantages of Reserved Instances? (Choose two.)",
            "How do Amazon EC2 Auto Scaling groups help achieve high availability for a web application?",
            "How can one AWS account use Reserved Instances from another AWS account?",
            "A customer runs an On-Demand Amazon Linux EC2 instance for 3 hours, 5 minutes, and 6 seconds.For how much time will the customer be billed?", // 220 Each partial instance-hour consumed will be billed per-second for Linux Instances and as a full hour for all other instance types (Microsoft).”
            "Which of the following AWS services provide compute resources? (Choose two.)",
            "Which AWS service enables users to deploy infrastructure as code by automating the process of provisioning resources?",
            "Which AWS services provide a way to extend an on-premises architecture to the AWS Cloud? (Choose two.)",
            "Which of the following allows users to provision a dedicated network connection from their internal network to AWS?",
            "Which services use AWS edge locations? (Choose two.)", //225
            "Which service would provide network connectivity in a hybrid architecture that includes the AWS Cloud?",
            "Which tool can be used to compare the costs of running a web application in a traditional hosting environment to running it on AWS?",
            "What is the value of using third-party software from AWS Marketplace instead of installing third-party software on Amazon EC2? (Choose two.)",
            "Which of the following is a cloud architectural design principle?",
            "Under the shared responsibility model; which of the following areas are the customer's responsibility? (Choose two.)", //230
            "Which service enables customers to audit and monitor changes in AWS resources?",
            "Which AWS service identifies security groups that allow unrestricted access to a user's AWS resources?",
            "According to the AWS shared responsibility model, who is responsible for configuration management?",
            "Which AWS service is a content delivery network that securely delivers data, video, and applications to users globally with low latency and high speeds?",
            "Which benefit of the AWS Cloud supports matching the supply of resources with changing workload demands?", //235
            " user is running an application on AWS and notices that one or more AWS-owned IP addresses is involved in a distributed denial-of-service (DDoS) attack.Who should the user contact FIRST about this situation?",
            "Which of the following are benefits of hosting infrastructure in the AWS Cloud? (Choose two.)",
            "What AWS service would be used to centrally manage AWS access policies across multiple accounts?",
            "What is AWS Trusted Advisor?",
            "Which AWS service or feature allows a company to visualize, understand, and manage AWS costs and usage over time?", //240
            "Which of the following is an AWS Well-Architected Framework design principle related to Performance Efficiency? (Choose two.)", //kk// kk =my own q
            "Which of the following is an AWS Well-Architected Framework design principle related to Operational Excellence? (Choose two.)", //kk // kk =my own q
            "Which of the following is an AWS Well-Architected Framework design principle related to Operational Excellence? (Choose two.)", //kk
            "Which of the following is an AWS Well-Architected Framework design principle related to Security? (Choose two.)", // kk
            "Which of the following is an AWS Well-Architected Framework design principle related to Reliability? (Choose two.)", // kk 245
            "Which of the following is an AWS Well-Architected Framework design principle related to Cost Optimization? (Choose two.)", // kk
            "Which of the following are categories of AWS Trusted Advisor? (Select TWO.)", //kk
            "Which AWS services are defined as global instead of regional?", // kk
            "Which of those services are free but could provide services which cost money? (Choose two.)", //kk
            "According to AWS Support plans pricing, Which pricing is correct?", // kk250
            "What can AWS edge locations be used for? (Select TWO.)",
            " Access keys in AWS Identity and Access Management (IAM) are used to:)",
            "Which AWS service handles the deployment details of capacity provisioning, load balancing, Auto Scaling, and application health monitoring?",
            "Which AWS service provides inbound and outbound network ACLs to harden external connectivity to Amazon EC2?",
            "When a company provisions web servers in multiple AWS Regions, what is being increased?",//255
            "",
            "",
            "",
            "",
            "", //260
    };




    public final static int[] RIGHT_ANSWERS_N = {1,1,1,1,1,1,2,1,1,2,
    1,2,2,1,1,1,3,2,1,1,    1,1,1,1,1,1,1,2,1,1,       2,2,1,1,1,1,1,1,1,1,      1,1,1,1,1,1,1,1,2,1, //1-50
    2,1,1,1,1,1,1,2,1,2,     1,1,1,1,2,1,1,1,1,1,      1,1,1,2,1,1,1,1,1,1,          1,1,2,1,2,1,1,1,1,1 , 1,1,1,2,1,2,1,1,2,1, //51-100
    2,1,2,1,1, 1,1,1,1,1,    2,2,1,1,2, 2,1,1,1,1,        1,2,1,1,1, 1,1,1,1,1,      1,1,1,1,2, 1,1,2,1,1,        2,2,2,1,2 ,1,1,1,1,1,  // 101-150
    1,1,1,1,1,   1,2,1,1,1,      2,1,1,1,1,  1,1,1,2,1,      1,1,1,1,1,   1,1,1,1,1 ,      1, 1,1,1,1, 2,2,1,1,1,        1,1,1,1,1,   1,2,3,1,1, // 151-200
    1,1,1,1,1, 1,1,1,2,1,    2,2,1,1,1,  1,2,1,1,1,  2,1,2,1,2,  1,1,2,1,2,    1,1,1,1,1,  1,2,1,1,1,      2,2,2,2,2,     2,2,1,2,2,      //250
   2,1,1,1,1,    };

    public final static int[] [] RIGHT_ANSWERS = {new int[]{2}, new int[]{2}, new int[]{2}, new int[]{2}, new int[]{2},
            new int[]{2}, new int[]{0,1}, new int[]{1}, new int[]{2}, new int[]{2,3}, // 10
            new int[]{1}, new int[]{1,4}, new int[]{0,1}, new int[]{2}, new int[]{3}, // 15
            new int[]{1}, new int[]{1,2,3}, new int[]{0,3}, new int[]{2},new int[]{3}, //20
            new int[]{2},  new int[]{2}, new int[]{2},  new int[]{2},  new int[]{2},//25
            new int[]{1},  new int[]{2}, new int[]{1,3},  new int[]{2},  new int[]{1}, //30
            new int[]{3,4},  new int[]{1,4}, new int[]{0},  new int[]{0},  new int[]{0}, //35
            new int[]{3},  new int[]{1}, new int[]{2},  new int[]{0},  new int[]{1}, //40
            new int[]{2},  new int[]{3}, new int[]{1},  new int[]{0},  new int[]{1}, //45
            new int[]{1},  new int[]{2}, new int[]{2},  new int[]{3,4},  new int[]{0}, //50
            new int[]{0,2},  new int[]{3}, new int[]{3},  new int[]{1},  new int[]{0}, //55
            new int[]{3},  new int[]{1}, new int[]{0,2},  new int[]{1},  new int[]{1,4}, //60
            new int[]{2},  new int[]{2}, new int[]{3},  new int[]{1},  new int[]{1,2}, //65
            new int[]{3},  new int[]{3}, new int[]{3},  new int[]{1},  new int[]{1}, //70
            new int[]{3},  new int[]{1}, new int[]{0},  new int[]{0,3},  new int[]{2}, //75
            new int[]{0},  new int[]{1}, new int[]{0},  new int[]{3},  new int[]{0}, //80
            new int[]{1},  new int[]{1}, new int[]{1,2},  new int[]{2},  new int[]{2,4}, //85
            new int[]{1},  new int[]{0}, new int[]{2},  new int[]{0},  new int[]{3}, //90
            new int[]{1},  new int[]{0}, new int[]{3},  new int[]{0,3},  new int[]{0}, //95
            new int[]{0,2},  new int[]{2}, new int[]{3},  new int[]{0,2},  new int[]{2}, //100
            new int[]{0,4},  new int[]{1}, new int[]{1,4},  new int[]{2},  new int[]{1}, //105
            new int[]{0},  new int[]{1}, new int[]{2},  new int[]{2},  new int[]{3}, //110
            new int[]{1,4},  new int[]{2,3}, new int[]{2},  new int[]{0},  new int[]{2,4}, //115
            new int[]{0,4},  new int[]{3}, new int[]{1},  new int[]{1},  new int[]{0}, //120
            new int[]{2},  new int[]{1,3}, new int[]{2},  new int[]{1},  new int[]{2}, //125
            new int[]{2},  new int[]{1}, new int[]{2},  new int[]{2},  new int[]{3}, //130
            new int[]{2},  new int[]{2}, new int[]{1},  new int[]{1},  new int[]{1,2}, //135
            new int[]{1},  new int[]{3}, new int[]{1,2},  new int[]{1},  new int[]{3}, //140
            new int[]{2,3},  new int[]{1,2}, new int[]{0,1},  new int[]{0},  new int[]{1,2}, //145
            new int[]{3},  new int[]{0}, new int[]{3},  new int[]{1},  new int[]{1}, //150
            new int[]{1},  new int[]{0}, new int[]{2},  new int[]{1},  new int[]{2}, //155
            new int[]{2},  new int[]{1,3}, new int[]{2},  new int[]{1},  new int[]{3}, //160
            new int[]{2,4},  new int[]{2}, new int[]{2},  new int[]{1},  new int[]{3}, //165
            new int[]{2},  new int[]{1}, new int[]{2},  new int[]{1,3},  new int[]{3}, //170
            new int[]{1},  new int[]{0}, new int[]{0},  new int[]{1},  new int[]{1}, //175
            new int[]{0},  new int[]{1}, new int[]{3},  new int[]{0},  new int[]{0}, //180
            new int[]{3},  new int[]{2}, new int[]{3},  new int[]{1},  new int[]{3}, //185
            new int[]{1,4},  new int[]{2,4}, new int[]{1},  new int[]{1},  new int[]{3}, //190
            new int[]{3},  new int[]{1}, new int[]{2},  new int[]{0},  new int[]{3}, //195
            new int[]{3},  new int[]{0,3}, new int[]{0,2,4},  new int[]{1},  new int[]{0}, //200
            new int[]{3},  new int[]{1}, new int[]{1},  new int[]{1},  new int[]{2}, //205
            new int[]{1},  new int[]{2}, new int[]{3},  new int[]{0,3},  new int[]{2}, //210
            new int[]{0,1},  new int[]{0,4}, new int[]{1},  new int[]{3},  new int[]{1}, //215
            new int[]{2},  new int[]{0,4}, new int[]{1},  new int[]{1},  new int[]{1}, //220
            new int[]{0,1},  new int[]{1}, new int[]{1,3},  new int[]{1},  new int[]{0,4}, //225
            new int[]{1},  new int[]{3}, new int[]{0,1},  new int[]{1},  new int[]{1,4}, //230
            new int[]{3},  new int[]{1}, new int[]{2},  new int[]{2},  new int[]{2}, //235
            new int[]{3},  new int[]{0,2}, new int[]{3},  new int[]{2},  new int[]{1}, //240

            new int[]{0,1},  new int[]{0,1}, new int[]{0,1},  new int[]{0,1},  new int[]{0,1}, //245
            new int[]{0,1},  new int[]{0,1}, new int[]{0},  new int[]{0,1},  new int[]{0,1}, //250
            new int[]{1,3},  new int[]{1}, new int[]{1},  new int[]{2},  new int[]{1}, //255
    };


    public final static String[] [] Q_ANSWERS = {new String[]{"A. Ensuring that disk drives are wiped after use.", " B. Ensuring that firmware is updated on hardware devices.",
    " C. Ensuring that data is encrypted at rest.", "D. Ensuring that network cables are category six or higher."}, // 1
            new String[]{"A. Cost allocation tags", " B. Consolidated billing", // 2
                    " C. AWS Budgets", "D. AWS Marketplace."},
            new String[]{"A. Amazon Glacier", " B. AWS Storage Gateway", // 3
                    " C. AWS S3", "D. AWS EBS."},
            new String[]{"A. AWS Enterprise Support", " B. AWS Solutions Architects", // 4
                    " C. AWS Professional Services", "D. AWS Account Managers."},
            new String[]{"A. AWS Partner Network Technology Partners", " B. AWS Marketplace", // 5
                    " C. AWS Partner Network Consulting Partners", "D. AWS Service Catalog"},
            new String[]{"A. Implement automation.", " B. Design for agility.", // 6
                    " C. Design for failure.", "D. Implement elasticity."},
            new String[]{"A. Amazon EC2", " B. Amazon Relational Database Service (Amazon RDS)", // 7
                    " C. Amazon Aurora", "D. Amazon Redshift", " E. Amazon S3"},
            new String[]{"A. AWS Cost Explorer", " B.AWS Trusted Advisor", // 8
                    " C. Consolidated billing", "D. Detailed billing"},
            new String[]{"A. Spot Instances", " B. Reserved Instances", // 9
                    " C. Dedicated Hosts", "D. On-Demand Instances"},
            new String[]{"A. High availability", " B. Shared security model", // 10
                    " C. Elasticity", "D. Pay-as-you-go pricing", " E. Reliability",},
            new String[]{"A. Amazon CloudWatch", " B. AWS CloudTrail", // 11
                    " C. AWS Config", "D. AWS Health"},
            new String[]{"A. A global file system", " B. An object store", // 12
                    " C. A local file store", "D. A network file system", " E. A  durable storage system",},
            new String[]{"A. Amazon Route 53", " B. Virtual Private Gateway", // 13
                    " C. Classic Load Balancer", "D. Auto Scaling", "E. Amazon CloudWatch default metrics"},
            new String[]{"A. Project management", " B. Antivirus software licensing", // 14
                    " C. Data center security", "D. Software development"},
            new String[]{"A. Amazon Redshift", " B. Amazon DynamoDB", // 15
                    " C. Amazon Elastic Compute Cloud (Amazon EC2) with Amazon EC2 instance store", "D. Amazon EC2 with Amazon Elastic Block Store (Amazon EBS)"},
            new String[]{"A. Data centers contain regions.", " B. Regions contain Availability Zones.", // 16
                    " C. Availability Zones contain edge locations.", "D. Edge locations contain regions."},
            new String[]{"A. Detailed billing report", " B. Cost allocation tags", // 17
                    " C. AWS Simple Monthly Calculator", "D. AWS Total Cost of Ownership (TCO) Calculator", " E. Cost Estimator",},
            new String[]{"A. The ability to receive one bill for multiple accounts", " B. Service limits increasing by default in all accounts", // 18
                    " C. A fixed discount on the monthly bill", "D. Potential volume discounts, as usage in all accounts is combined", " E. The automatic extension of the master accountג€™s AWS support plan to all accounts",},
            new String[]{"A. One-year, No Upfront, Standard RI pricing", " B. One-year, All Upfront, Convertible RI pricing", // 19
                    " C. Three-year, All Upfront, Standard RI pricing", "D. Three-year, No Upfront, Convertible RI pricing"},
            new String[]{"A. greater variable costs and greater upfront costs.", " B. fixed usage costs and lower upfront costs.", // 20
                    " C. lower variable costs and greater upfront costs.", "D. lower variable costs and lower upfront costs."},
            new String[]{"A. host Amazon EC2 instances closer to users.", " B. help lower latency and improve performance for users.", // 21
                    " C. cache frequently changing data without reaching the origin server.", "D. refresh data changes daily."},
            new String[]{"A. A public and private key-pair", " B. Amazon Inspector", // 22
                    " C. AWS Identity and Access Management (IAM) policies", "D. Security Groups"},
            new String[]{"A. Calling AWS Support", " B. Contacting AWS Professional Services to request a workshop", // 23
                    " C. Accessing forums, blogs, and whitepapers", "D. Attending AWS classes at a local university"},
            new String[]{"A. Dedicated RIs", " B. Scheduled RIs", // 24
                    " C. Convertible RIs", "D. Standard RIs"},
            new String[]{"A. Shared responsibility security model", " B. Single tenancy", // 25
                    " C. Elastic computing", "D. Encryption"},
            new String[]{"A. AWS CodePipeline", " B. Elastic Load Balancing", // 26
                    " C. Amazon EBS", "D. AWS Direct Connect"},
            new String[]{"A. Amazon Inspector", " B. AWS CloudTrail", // 27
                    " C. AWS Artifact", "D. AWS Certificate Manager"},
            new String[]{"A. Patching operating system components for Amazon Relational Database Server (Amazon RDS)", " B. Encrypting data on the client-side", // 28
                    " C. Training the data center staff", "D. Configuring Network Access Control Lists (ACL)", "E. Maintaining environmental controls within a data center"},
            new String[]{"A. Ensure that components have low-latency network connectivity.", " B.  Run enough Amazon EC2 instances to operate at peak load.", // 29
                    " C. Ensure that the application is designed to accommodate failure of any single component.", "D. Use a monolithic application that handles all operations."},
            new String[]{"A. Use tightly coupled components.", " B. Use loosely coupled components.", // 30
                    " C. Use infrequently coupled components.", "D. Use frequently coupled components."},
            new String[]{"A. Implementing Amazon Rekognition", " B. Using AWS Shield-protected resources", // 31
                    " C. Blocking access with Security Groups", "D. Using Multi-Factor Authentication (MFA)", "E. Enforcing password strength and expiration"},
            new String[]{"A. Amazon Glacier", " B. Amazon RDS", // 32
                    " C. AWS Snowball", "D. Amazon Redshift", "E. Amazon EFS"},
            new String[]{"A. It simplifies relational database administration tasks.", " B. It provides 99.99999999999% reliability and durability.", // 33
                    " C. It automatically scales databases for loads.", "D. It enables users to dynamically adjust CPU and RAM resources."},
            new String[]{"A. Amazon Aurora", " B. Amazon Redshift", // 34
                    " C. Amazon DynamoDB", "D. Amazon ElastiCache"},
            new String[]{"A. Availability Zone", " B. Edge location", // 35
                    " C. Region", "D. Private networking"},
            new String[]{"A. Providing a key for Amazon S3 client-side encryption", " B. Configuration of an Amazon EC2 instance", // 36
                    " C. Environmental controls of physical AWS data centers", "D. Awareness and training"},
            new String[]{"A. A minimum of one", " B. A minimum of two", // 37
                    " C. A minimum of three", "D. A minimum of four or more"},
            new String[]{"A. it allows the business to eliminate IT bills.", " B. it allows the business to put a server in each customerג€™s data center.", // 38
                    " C. it allows the business to focus on business activities.", "D. it allows the business to leave servers unpatched."},
            new String[]{"A. Amazon S3", " B. Amazon Glacier", // 39
                    " C. Amazon EBS", "D. Amazon EC2 Instance Store"},
            new String[]{"A. API keys", " B. Access keys", // 40
                    " C. User names/Passwords", "D. SSH keys"},
            new String[]{"A. Amazon Redshift", " B. Amazon RDS", // 41
                    " C. Amazon DynamoDB", "D. Amazon S3"},
            new String[]{"A. Access to multiple instance types", " B. Access to managed services", // 42
                    " C. Using Consolidated Billing to produce one bill", "D. Decreased acquisition time for new compute resources"},
            new String[]{"A. AWS IAM", " B. AWS Organizations", // 43
                    " C. AWS Schema Conversion Tool", "D. AWS Config"},
            new String[]{"A. Using many instances in parallel", " B. Using a single large instance during off-peak hours", // 44
                    " C. Using dedicated hardware", "D. Using a large GPU instance type"},
            new String[]{"A. AWS IAM policies", " B. Physical security", // 45
                    " C. Amazon S3 bucket policies", "D. AWS CloudTrail Logs"},
            new String[]{"A. Fault tolerance", " B. Global reach", // 46
                    " C. Pay-as-you-go pricing", "D. High availability"},
            new String[]{"A. Patching underlying infrastructure", " B. Physical security", // 47
                    " C. Patching Amazon EC2 instances", "D. Patching network infrastructure"},
            new String[]{"A. Create one global AWS acount and move all AWS resources to tha account.", " B. Sign up for three years of Reserved Instance pricing up front.", // 48
                    " C. Use the consolidated billing feature from AWS Organizations.", "D. Sign up for the AWS Enterprise support plan to get volume discounts."},
            new String[]{"A. Summaries by Amazon Simple Notification Service (Amazon SNS)", " B. Free Amazon Elasticsearch Service analytics", // 49
                    " C. Provided at no charge", "D. Real-time monitoring", "E. Adjustable retention"},
            new String[]{"A. Amazon Route 53", " B. Amazon Neptune", // 50
                    " C. Amazon SageMaker", "D. Amazon Lightsail"},
            new String[]{"A. Reduced latency to users", " B. The applicationג€™s presentation in the local language", // 51
                    " C. Data sovereignty compliance", "D. Cooling costs in hotter climates", "E. Proximity to the customerג€™s office for on-site visits"},
            new String[]{"A. Amazon Glacier", " B. Amazon DynamoDB", // 52
                    " C. Amazon Elastic File System (Amazon EFS)", "D. Amazon Simple Storage Service (Amazon S3)"},
            new String[]{"A. Reserved Instances", " B. On-Demand", // 53
                    " C. Dedicated Hosts", "D. Spot Instances"},
            new String[]{"A. Physical access controls", " B. Data encryption", // 54
                    " C. Secure disposal of storage devices", "D. Environmental risk management"},
            new String[]{"A. Amazon EC2", " B. Amazon Route 53", // 55
                    " C. Amazon ElastiCache", "D. Amazon DynamoDB"},
            new String[]{"A. Amazon Simple Storage Service (Amazon S3)", " B. Amazon DynamoDB", // 56
                    " C. Amazon Kinesis", "D. Amazon Redshift"},
            new String[]{"A. It translates a domain name into an IP address using DNS.", " B. It distributes incoming application traffic across one or more Amazon EC2 instances.", // 57
                    " C. It collects metrics on connected Amazon EC2 instances.", "D. It automatically adjusts the number of Amazon EC2 instances to support incoming traffic."},
            new String[]{"A. Command line interface", " B. On-premises", // 58
                    " C. Software Development Kits", "D. Software-as-a-service", "E. Hybrid"},
            new String[]{"A. agility.", " B. global infrastructure.", // 59
                    " C. elasticity.", "D. pay-as-you-go pricing."},
            new String[]{"A. AWS Storage Gateway", " B. Amazon S3", // 60
                    " C. Amazon Elastic File System (EFS)", "D. Amazon Glacier", "E. Amazom CloudFront"},

            new String[]{"A. Cloud-native", " B. Partner network", // 61
                    " C. Hybrid architecture", "D. Infrastructure as a service"},
            new String[]{"A. They require the customer to monitor and replace failing instances.", " B. They have better performance than customer-managed services.", // 62
                    " C. They simplify patching and updating underlying OSs.", "D. They do not require the customer to optimize instance type or size selections."},
            new String[]{"A. Amazon Redshift", " B. Amazon Elastic File System (Amazon EFS)", // 63
                    " C. Amazon Elastic Container Service (Amazon ECS)", "D. Amazon S3"},
            new String[]{"A. IAM group", " B. IAM user", // 64
                    " C. IAM role", "D. IAM policy"},
            new String[]{"A. Multi-factor authentication physical tokens", " B. AWS Trusted Advisor security checks", // 65
                    " C. Data encryption", "D. Automated penetration testing", "E. Amazon S3 copyrighted content detection"},
            new String[]{"A. AWS Batch", " B. AWS Artifact", // 66
                    " C. AWS Data Pipeline", "D. Amazon RDS"},
            new String[]{"A. Amazon S3", " B. Amazon Glacier", // 67
                    " C. Amazon Elastic Block Store (Amazon EBS)", "D. Amazon Elastic File System (Amazon EFS)"},
            new String[]{"A. Use the largest instance possible", " B. Provision capacity for peak load", // 68
                    " C. Use the Scrum development process", "D. Implement elasticity"},
            new String[]{"A. Amazon RDS", " B. Amazon Glacier", // 69
                    " C. AWS Snowball", "D. AWS EBS"},
            new String[]{"A. Physical controls", " B. Patch management", // 70
                    " C. Zone security", "D. Data center auditing"},
            new String[]{"A. AWS VPN", " B. Amazon Redshift", // 71
                    " C. API Gateway", "D. Amazon Direct Connect"},
            new String[]{"A. Amazon Elastic Compute Cloud (Amazon EC2)", " B. AWS Lambda", // 72
                    " C. Amazon DynamoDB", "D. AWS CodeCommit"},
            new String[]{"A. AWS Personal Health Dashboard", " B. AWS Service Health Dashboard", // 73
                    " C. AWS Trusted Advisor", "D. AWS Infrastructure Event Management"},
            new String[]{"A. Fault Tolerance", " B. Instance Usage", // 74
                    " C. Infrastructure", "D. Performance", "E. Storage Capacity"},
            new String[]{"A. Granting access to individuals and services", " B. Encrypting data in transit", // 75
                    " C. Updating Amazon EC2 host firmware", "D. Updating operating systems"},
            new String[]{"A. AWS Marketplace", " B. Amazon Lumberyard", // 76
                    " C. AWS Artifact", "D. Amazon CloudSearch"},
            new String[]{"A. Permissive security removes the administrative burden.", " B. Ability to focus on revenue-generating activities.", // 77
                    " C. Control over cloud network hardware.", "D. Choice of specific cloud hardware vendors.."},
            new String[]{"A. Dedicated Hosts", " B. Reserved Instances", // 78
                    " C. On-Demand Instances", "D. No Upfront Reserved Instances"},
            new String[]{"A. AWS CodePipeline", " B. AWS CodeDeploy", // 79
                    " C. AWS Direct Connect", "D. AWS CloudFormation"},
            new String[]{"A. AWS Config", " B. AWS Trusted Advisor", // 80
                    " C. Amazon CloudWatch", "D. Amazon Inspector"},
            new String[]{"A. A code repository with customizable build and team commit features.", " B. A metrics repository with customizable notification thresholds and channels.", // 81
                    " C. A security configuration repository with threat analytics.", "D. A rule repository of a web application firewall with automated vulnerability prevention features."},
            new String[]{"A. AWS Server Migration Service", " B. AWS Organizations", // 82
                    " C. AWS Budgets", "D. AWS Trusted Advisor"},
            new String[]{"A. AWS Elastic Beanstalk", " B. AWS OpsWorks", // 83
                    " C. AWS CodeDeploy", "D. AWS Batch", "E. AWS X-Ray"},
            new String[]{"A. On-Demand Instances", " B. Reserved Instances", // 84
                    " C. Spot Instances", "D. Convertible Reserved Instances"},
            new String[]{"A. Use manual monitoring.", " B. Use fixed servers.", // 85
                    " C. Implement loose coupling.", "D. Rely on individual components.", "E. Design for scalability."},
            new String[]{"A. Enterprise", " B. Business", // 86
                    " C. Developer", "D. Basic"},
            new String[]{"A. AWS Artifact", " B. AWS Concierge", // 87
                    " C. AWS Certificate Manager", "D. AWS Trusted Advisor"},
            new String[]{"A. AWS Service Health Dashboard", " B. AWS X-Ray", // 88
                    " C. AWS Personal Health Dashboard", "D. Amazon CloudWatch"},
            new String[]{"A. Volume pricing qualification", " B. Shared access permissions", // 89
                    " C. Multiple bills per account", "D. Eliminates the need for tagging"},
            new String[]{"A. Conduct penetration testing using Amazon Inspector, and then notify AWS support.", " B. Request and wait for approval from the customerג€™s internal security team, and then conduct testing.", // 90
                    " C. Notify AWS support, and then conduct testing immediately.", "D. Request and wait for approval from AWS support, and then conduct testing."},
            new String[]{"A. Amazon Elastic Block Store (Amazon EBS)", " B. Amazon Machine Image", // 91
                    " C. Amazon EC2 Systems Manager", "D. Amazon AppStream 2.0"},
            new String[]{"A. Apply an IAM policy to an IAM group.", " B. Apply an IAM policy to an IAM role.", // 92
                    " C. Apply the same IAM policy to all IAM users with access to the same workload.", "D. Apply an IAM policy to an Amazon Cognito user pool."},
            new String[]{"A. Load balancing", " B. Automatic failover", // 93
                    " C. Round robin", "D. Auto Scaling"},
            new String[]{"A. Amazon Route 53", " B. Amazon EC2", // 94
                    " C. Amazon S3", "D. Amazon CloudFront", "E. Amazon DynamoDB"},
            new String[]{"A. AWS Artifact", " B. AWS Lambda", // 95
                    " C. Amazon Inspector", "D. AWS Certificate Manager"},
            new String[]{"A. Ensuring that application data is encrypted at rest", " B. Ensuring that AWS NTP servers are set to the correct time", // 96
                    " C. Ensuring that users have received security training in the use of AWS services", "D. Ensuring that access to data centers is restricted", "E. Ensuring that hardware is disposed of properly"},
            new String[]{"A. Amazon EBS", " B. Amazon S3", // 97
                    " C. Amazon EC2", "D. Amazon ECS"},
            new String[]{"A. Amazon EC2 Spot Instances", " B. Amazon EC2 Dedicated Instances", // 98
                    " C. Amazon EC2 On-Demand Instances", "D. Amazon EC2 Reserved Instances"},
            new String[]{"A. reduced Total Cost of Ownership (TCO).", " B. increased capital expenditure (capex).", // 99
                    " C. reduced operational expenditure (opex).", "D. deferred payment plans for startups.", "E. business credit lines for stratups."},
            new String[]{"A. AWS Cost Explorer", " B. AWS Budgets", // 100
                    " C. AWS Cost and Usage report", "D. AWS Billing dashboard"},
            new String[]{"A. AWS Concierge", " B. AWS CloudFormation", // 101
                    " C. Amazon Simple Storage Service (Amazon S3)", "D. Amazon EC2 Auto Scaling", "E. AWS Management Console"},
            new String[]{"A. Implement single points of failure.", " B. Implement loose coupling.", // 102
                    " C. Implement monolithic design.", "D. Implement vertical scaling."},
            new String[]{"A. Enable AWS CloudTrail.", " B. Grant least privilege access to IAM users.", // 103
                    " C. Create one IAM user and share with many developers and users.", "D.  Enable Amazon CloudFront.", "E. Activate multi-factor authentication (MFA) for privileged users."},
            new String[]{"A. Amazon Glacier", " B.     AWS Snowball", // 104
                    " C. AWS Storage Gateway", "D. Amazon Elastic Block Storage (Amazon EBS)"},
            new String[]{"A.  Amazon RDS", " B. Amazon EC2", // 105
                    " C.  Amazon ElastiCache", "D. AWS Fargate"},
            new String[]{"A. Use multiple Availability Zones.", " B. Use tightly coupled components.", // 106
                    " C. Use open source software.", "D. Provision extra capacity."},
            new String[]{"A. Developer", " B. Enterprise", // 107
                    " C. Business", "D. Basic"},
            new String[]{"A. AWS manages the data stored in Amazon RDS tables.", " B. AWS manages the maintenance of the operating system.", // 108
                    " C. AWS automatically scales up instance types on demand.", "D. AWS manages the database type."},
            new String[]{"A. Amazon Machine Learning", " B. Amazon SQS", // 109
                    " C. Amazon ElastiCache", "D. Amazon EC2 Instance Store"},
            new String[]{"A. Patching operating system software", " B. Encrypting data", // 110
                    " C. Enforcing multi-factor authentication", "D. Auditing physical data center assets"},
            new String[]{"A. AWS Trusted Advisor", " B. AWS Online Tech Talks", // 111
                    " C. AWS Blog", "D. AWS Forums", "AWS Classroom Training"}, //1,4 Which options does AWS make available for customers who want to learn about security in the cloud in an instructor-led setting? (Choose two.)
            new String[]{"A. Amazon CloudFront distributions", " B. Amazon Route 53", // 112 // 2,3
                    " C. Security Groups", "D. Subnets", "E. Elastic Load Balancing"}, //Which of the following features can be configured through the Amazon Virtual Private Cloud (Amazon VPC) Dashboard? (Choose two.)
            new String[]{"A. Use AWS Budgets on each account to pay only to budget.", " B. Contact AWS Support for a monthly bill.", // 113 If each department within a company has its own AWS account, what is one way to enable consolidated billing?
        " C. Create an AWS Organization from the payer account and invite the other accounts to join.", "D. Put all invoices into one Amazon Simple Storage Service (Amazon S3) bucket, load data into Amazon Redshift, and then run a billing report."}, // 2
            new String[]{"A. Periodic price reductions as the result of Amazon's operational efficiencies", " B. New Amazon EC2 instance types providing the latest hardware", // 114 How do customers benefit from Amazon's massive economies of scale?
                    " C. The ability to scale up and down when needed", "D. Increased reliability in the underlying hardware of Amazon EC2 instances"}, //0
            new String[]{"A. Amazon CloudFront", " B. AWS Cloud9", // 115 Which AWS services can be used to gather information about AWS account activity? (Choose two.)
                    " C. AWS CloudTrail", "D. AWS CloudHSM", "E. Amazon CloudWatch"}, //2,4
//Which of the following common IT tasks can AWS cover to free up company IT resources? (Choose two.)
            new String[]{"A. Patching databases software", " B. Testing application releases", // 116 //Which of the following common IT tasks can AWS cover to free up company IT resources? (Choose two.)
                    " C. Backing up databases", "D. Creating database schema", "E. Running penetration tests"}, //0,4
            new String[]{"A. company wants to move its main website to AWS from an on-premises web server.", " B. company has a number of application services whose Service Level Agreement (SLA) requires 99.999% uptime.", // 117 // 3
                    " C. company's heavily used legacy database is currently running on-premises.", "D. company has a number of infrequent, interruptible jobs that are currently using On-Demand Instances."}, // In which scenario should Amazon EC2 Spot Instances be used?
            new String[]{"A. AWS Direct Connect", " B. Availability Zones", // 118 Which AWS feature should a customer leverage to achieve high availability of an application?
                    " C. Data centers", "D. Amazon Virtual Private Cloud (Amazon VPC)"}, //1
            new String[]{"A. Enterprise", " B. Business", // 119 Which is the minimum AWS Support plan that includes Infrastructure Event Management without additional costs?
                    " C. Developer", "D. Basic"}, //1
            new String[]{"A. Amazon S3", " B. Amazon Route 53", // 120 // 0
                    " C. Amazon QuickSight", "D. AWS X-Ray"}, //Which AWS service can serve a static website?
            new String[]{"A. It supplies an online IT ticketing platform for resource requests.", " B. It supports automatic code validation services.", // 121,,How does AWS shorten the time to provision IT resources?
                    " C. It provides the ability to programmatically provision existing resources.", "D. It automates the resource request process from a company's IT vendor list."}, //2
            new String[]{"A. Hosting applications", " B. Delivering content closer to users", // 122 //What can AWS edge locations be used for? (Choose two.)
                    " C. Running NoSQL database caching services", "D. Reducing traffic on the server by caching responses", "E. Sending notification messages to end users"}, //1,3
            new String[]{"A. A public and private key-pair", " B. Amazon Inspector", // 123 Which of the following can limit Amazon Simple Storage Service (Amazon S3) bucket access to specific users?
                    " C. AWS Identity and Access Management (IAM) policies", "D. Security Groups"}, //2
            new String[]{"A. Think parallel", " B. Implement elasticity", // 124 A solution that is able to support growth in users, traffic, or data size with no drop in performance aligns with which cloud architecture principle?
                    " C. Decouple your components", "D. Design for failure"}, //1
            new String[]{"A. Moving from variable operational expense (opex) to upfront capital expense (capex).", " B. Moving from upfront capital expense (capex) to variable capital expense (capex).", // 125 A company will be moving from an on-premises data center to the AWS Cloud.What would be one financial difference after the move?
                    " C. Moving from upfront capital expense (capex) to variable operational expense (opex).", "D. Elimination of upfront capital expense (capex) and elimination of variable operational expense (opex)"}, //2
            new String[]{"A. Amazon Aurora Backtrack", " B. Amazon CloudWatch Billing Alarms", // 126 How should a customer forecast the future costs for running a new web application?
                    " C. AWS Simple Monthly Calculator", "D. AWS Cost and Usage report"}, //was 3 but it's actually  2
            new String[]{"A. Enterprise", " B. Business", // 127 Which is the MINIMUM AWS Support plan that provides technical support through phone calls?
                    " C. Developer", "D. Basic"}, //1
            new String[]{"A. Encrypting client-side data", " B. Configuring AWS Identity and Access Management (IAM) roles", // 128 Which of the following tasks is the responsibility of AWS?
                    " C. Securing the Amazon EC2 hypervisor", "D. Setting user password policies"}, //2
            new String[]{"A. the ability to bid for a lower hourly cost.", " B. paying a daily rate regardless of time used.", // 129  One benefit of On-Demand Amazon Elastic Compute Cloud (Amazon EC2) pricing is:
                    " C. paying only for time used.", "D. pre-paying for instances and paying a lower hourly rate."}, //2
            new String[]{"A. AWS Well-Architected Framework documentation", " B. Amazon CloudFront", // 130 An administrator needs to rapidly deploy a popular IT solution and start using it immediately.Where can the administrator find assistance?
                    " C. AWS CodeCommit", "D. AWS Quick Start reference deployments"}, //3
            new String[]{"A. Amazon EMR", " B. Elastic Load Balancing", // 131 Which of the following services is in the category of AWS serverless platform?
                    " C. AWS Lambda", "D. AWS Mobile Hub"}, //2
            new String[]{"A. Amazon EC2, Amazon S3, Amazon Athena", " B. Amazon Kinesis, Amazon SQS, Amazon EMR", // 132 Which services are parts of the AWS serverless platform?
                    " C. AWS Step Functions, Amazon DynamoDB, Amazon SNS", "D. Amazon Athena, Amazon Cognito, Amazon EC2"}, //2
            new String[]{"A. Application security", " B. Edge location management", // 133 According to the AWS shared responsibility model, what is the sole responsibility of AWS?
                    " C. Patch management", "D. Client-side data"}, //1
            new String[]{"A. Multi-factor authentication", " B. Groups", // 134 Which AWS IAM feature is used to associate a set of permissions with multiple users?
                    " C. Password policies", "D. Access keys"}, //1
            new String[]{"A. Unlimited uptime", " B. Elasticity", // 135 Which of the following are benefits of the AWS Cloud? (Choose two.)
                    " C. Agility", "D. Colocation", "E. Capital expenses"}, //1,2
            new String[]{"A. Amazon Connect", " B. AWS Directory Service", // 136 Which of the following can a customer use to enable single sign-on (SSO) to the AWS Console?
                    " C. Amazon Pinpoint", "D. Amazon Rekognition"}, //1
            new String[]{"A. AWS Direct Connects", " B. Amazon VPCs", // 137 What are the multiple, isolated locations within an AWS Region that are connected by low-latency networks called?
                    " C. Edge locations", "D. Availability Zones"}, //3
            new String[]{"A. It verifies that hosted workloads are automatically compliant with the controls of supported compliance frameworks.", " B. AWS is responsible for the maintenance of common compliance framework documentation.", // 138 Which of the following benefits does the AWS Compliance program provide to AWS customers? (Choose two.)
                    " C. It assures customers that AWS is maintaining physical security and data protection.", "D. It ensures the use of compliance frameworks that are being used by other cloud providers.", "E. It will adopt new compliance frameworks as they become relevant to customer workloads."}, //0,1
            new String[]{"A. AWS IAM", " B. AWS Artifact", // 139 Which of the following services provides on-demand access to AWS compliance reports?
                    " C. Amazon GuardDuty", "D. AWS KMS"}, //1
            new String[]{"A. Security management of data center", " B. Patch management", // 140 As part of the AWS shared responsibility model, which of the following operational controls do users fully inherit from AWS?
                    " C. Configuration management", "D. User and access management"}, //3
            new String[]{"A. Software development", " B. Project management", // 141 When comparing AWS Cloud with on-premises Total Cost of Ownership, which expenses must be considered? (Choose two.)
                    " C. Storage hardware", "D. Physical servers", "E. Antivirus software license"}, //2,3
            new String[]{"A. Maintaining the underlying Amazon EC2 hardware.", " B. Managing the VPC network access control lists.", // 142 When comparing AWS Cloud with on-premises Total Cost of Ownership, which expenses must be considered? (Choose two.)
                    " C. Encrypting data in transit and at rest.", "D. Replacing failed hard disk drives.", "E. Deploying hardware in different Availability Zones."}, //1,2
            new String[]{"A. Scaling the number of Amazon EC2 instances based on traffic.", " B. Resizing Amazon RDS instances as business needs change.", // 143 Which scenarios represent the concept of elasticity on AWS? (Choose two.)
                    " C. Automatically directing traffic to less-utilized Amazon EC2 instances.", "D. Using AWS compliance documents to accelerate the compliance process.", "E. Having the ability to create and govern environments using code."}, //0,1
            new String[]{"A. When there is flexibility in when an application needs to run.", " B. When there are mission-critical workloads.", // 144 When is it beneficial for a company to use a Spot Instance?
                    " C. When dedicated capacity is needed.", "D. When an instance should not be stopped."}, //0
            new String[]{"A. Amazon EC2 instance availability", " B. Power consumption of the data center", // 145 A company is considering moving its on-premises data center to AWS.What factors should be included in doing a Total Cost of Ownership (TCO) analysis? (Choose two.)
                    " C. Labor costs to replace old servers", "D. Application developer time", "E. Database engine capacity"}, //1,2
            new String[]{"A. Users bid on the maximum price they are willing to pay per hour.", " B. Users choose a 1-, 3- or 5-year upfront payment term.", // 146 How does AWS charge for AWS Lambda?
                    " C. Users pay for the required permanent storage on a file system or in a database.", "D. Users pay based on the number of requests and consumed compute resources."}, //3
            new String[]{"A. Act as a virtual firewall for the Amazon EC2 instance.", " B. Secure AWS user accounts with AWS identity and Access Management (IAM) policies.", // 147 What function do security groups serve related Amazon Elastic Compute Cloud (Amazon EC2) instance security?
                    " C. Provide DDoS protection with AWS Shield.", "D. Use Amazon CloudFront to protect the Amazon EC2 instance."}, //0
            new String[]{"A. Backup and restore", " B. Pilot light", // 148 Which disaster recovery scenario offers the lowest probability of down time?
                    " C. Warm standby", "D. Multi-site active-active"}, //3
            new String[]{"A. Cost Explorer", " B. AWS Total Cost of Ownership (TCO) Calculator", // 149  What will help a company perform a cost benefit analysis of migrating to the AWS Cloud?
                    " C. AWS Simple Monthly Calculator", "D. AWS Trusted Advisor"}, //1
            new String[]{"A. AWS Cost Explorer between AWS accounts", " B. Linked accounts and consolidated billing", // 150 Which of the following provides the ability to share the cost benefits of Reserved Instances across AWS accounts?
                    " C. Amazon Elastic Compute Cloud (Amazon EC2) Reserved Instance Utilization Report", "D. Amazon EC2 Instance Usage Report between AWS accounts"}, //1
            new String[]{"A. AWS Cost and Usage Reports", " B. AWS Organizations", // 151
                    " C. AWS Cost Explorer", "D. AWS Budgets"}, //1
            new String[]{"A. Amazon CloudFront", " B. AWS Direct Connect", // 152
                    " C. Amazon Route 53 global DNS", "D. Amazon Simple Storage Service (Amazon S3) transfer acceleration"}, //1
            new String[]{"A. On-premises", " B. Hybrid", // 153
                    " C. Cloud", "D. Platform as a service"}, // 2
            new String[]{"A. AWS provides a Configuration Management Database that users can maintain.", " B. AWS performs infrastructure discovery scans on the customer's behalf.", // 153
                    " C. Amazon EC2 automatically generates an asset report and places it in the customer's specified Amazon S3 bucket.", "D. Users can gather asset metadata reliably with a few API calls."}, // 1
            new String[]{"A. Snapshots", " B. Automatic patching and updating", // 155
                    " C. Cross-Region read replicas", "D. Provisioned IOPS"}, // 0??? xxx
            new String[]{"A. restricted access.", " B. as-needed access.", // 156
                    " C. least privilege access.", "D. token access."}, // 2
            new String[]{"A. Enable multi-factor authentication for the AWS account root user.", " B. Create separate accounts for each department.", // 157
                    " C. Use Reserved Instances whenever possible.", "D. Use tags to associate each instance with a particular department.", "E. Pay bills using purchase orders."}, // 1,3
            new String[]{"A. Securing the hardware, software, facilities, and networks that run all products and services.", " B. Providing certificates, reports, and other documentation directly to AWS customers under NDA.", // 158
                    " C. Configuring the operating system, network, and firewall.", "D. Obtaining industry certifications and independent third-party attestations."}, //2
            new String[]{"A. AWS X-Ray", " B. AWS Trusted Advisor", // 159
                    " C. Amazon CloudWatch", "D. AWS Systems Manager"}, //1
            new String[]{"A. Resource groups", " B. Lifecycle policies", // 160
                    " C. Application Load Balancer", "D. Amazon EC2 Auto Scaling"}, //3
            new String[]{"A. Visualization management", " B. Hardware management", // 161
                    " C. Encryption management", "D. Facilities management", "E. Firewall management"}, //2,4
            new String[]{"A. AWS Direct Connect", " B. AWS Snowball", // 162
                    " C. AWS Storage Gateway", "D. AWS Snowball Edge"}, //2
            new String[]{"A. Updating the network ACLs to block traffic to vulnerable ports.", " B. Patching operating systems running on Amazon EC2 instances.", // 163
                    " C. Updating the firmware on the underlying EC2 hosts.", "D. Updating the security group rules to block traffic to the vulnerable ports."}, //2
            new String[]{"A. Implement loose coupling.", " B. Design for failure.", // 164
                    " C. Automate everything that can be automated.", "D. Use services, not servers."}, //1
            new String[]{"A. It is granting permissions to a single user only.", " B. It is granting permissions using AWS IAM policies only.", // 165
                    " C. It is granting AdministratorAccess policy permissions to trustworthy users.", "D. It is granting only the permissions required to perform a given task."}, //3
            new String[]{"A. It facilitates low-latency request handling.", " B. It allows applications to have dependent workflows.", // 166
                    " C. It prevents cascading failures between different components.", "D. It allows companies to focus on their physical data center operations."}, //2
            new String[]{"A. Amazon Virtual Private Cloud (Amazon VPC) NAT Gateway", " B. AWS Direct Connect", // 167
                    " C. Amazon Simple Storage Service (Amazon S3) Transfer Acceleration", "D. AWS Web Application Firewall (AWS WAF)"}, //1
            new String[]{"A. Implementing elasticity, enabling the application to scale up or scale down as demand changes.", " B. Enabling several EC2 instances to run in parallel to achieve better performance.", // 168
                    " C.Focusing on decoupling components by isolating them and ensuring individual components can function when other components fail.", "D. Doubling EC2 computing resources to increase system fault tolerance."}, //2
            new String[]{"A. Configure AWS Certificate Manager", " B. Enable Multi-Factor Authentication (MFA)", // 169
                    " C. Use Amazon Cognito to manage access", "D. Configure a strong password policy", "E. Enable AWS Organizations"}, //1,3
            new String[]{"A. AWS Service Catalog", " B. AWS Config", // 170
                    " C. AWS Trusted Advisor", "D. AWS Organizations"}, //3
            new String[]{"A. AWS Cost and Usage reports", " B. AWS Budgets", // 171
                    " C. AAWS Cost Explorer", "D. AWS Trusted Advisor"},
            new String[]{"A. AWS security and compliance documents", " B. A download of configuration management details for all AWS resources", // 172
                    " C. Training materials for AWS services", "D. A security assessment of the applications deployed in the AWS Cloud"},
            new String[]{"A. Enterprise", " B. Business", // 173
                    " C. Developer", "D. Basic"},
            new String[]{"A. Deployment to a single Availability Zone", " B. Ability to recover from failure", // 174
                    " C. Design for cost optimization", "D. Perform operations as code"},
            new String[]{"A. Amazon EBS", " B. Amazon EC2 instance store", // 175
                    " C. Amazon EFS", "D. Amazon S3"},
            new String[]{"A. Users do not have to guess about future capacity needs.", " B. Users can utilize existing hardware contracts for purchases.", // 176
                    " C. Users can fix costs no matter what their traffic is.", "D. Users can avoid audits by using reports from AWS."},
            new String[]{"A. Amazon SWF", " B. Amazon EC2", // 177
                    " C. AWS Lambda", "D. Amazon Aurora"},
            new String[]{"A. Store data and backups in the same region.", " B. Design tightly coupled system components.", // 178
                    " C. Avoid multi-threading.", "D. Design for failure"},
            new String[]{"A. AWS Software Development Kit", " B. AWS Management Console", // 179
                    " C. AWS CodePipeline", "D. AWS Config"}, //177 181
            new String[]{"A. On-Demand Instances", " B. Reserved Instances", // 180
                    " C. Spot Instances", "D. Dedicated Instances"},
            new String[]{"A. Amazon Elastic Compute Cloud (Amazon EC2)", " B. Amazon Relational Database Service (Amazon RDS) for MySQL", // 181
                    " C. Amazon Lightsail", "D. Amazon Aurora"},
            new String[]{"A. Amazon VPC endpoints", " B. Amazon Elastic Compute Cloud (Amazon EC2) ClassicLink", // 182
                    " C. Amazon VPC peering", "D. AWS Direct Connect"},
            new String[]{"A. Amazon CodeStar", " B. AWS Command Line Interface (AWS CLI)", // 183
                    " C. Amazon Cognito", "D. AWS CodeCommit"},
            new String[]{"A. AWS Simple Monthly Calculator", " B. AWS Total Cost of Ownership (TCO) Calculator", // 184
                    " C. AWS Billing and Cost Management console", "D. Cost Explorer"},
            new String[]{"A. AWS Batch", " B. AWS Snowball", // 185
                    " C. AWS Migration Hub", "D. AWS Snowmobile"},
            new String[]{"A. Fixed-term", " B. Pay-as-you-go", // 186
                    " C. Colocation", "D. Planned", "E. Variable cost"},
            new String[]{"A. Public load balancers with AWS Application Auto Scaling capabilities", " B. F5 Big-IP and Citrix NetScaler load balancers", // 187
                    " C. Classic Load Balancers", "D. Cross-zone load balancers with public and private IPs", "E. Application Load Balancers"},
            new String[]{"A. AWS provides users with full control over the underlying resources.", " B. AWS does not require long-term contracts and provides a pay-as-you-go model.", // 188
                    " C. AWS offers edge locations in every country, supporting global reach.", "D. AWS has no limits on the number of resources that can be created."},
            new String[]{"A. AWS CloudTrail across multiple Availability Zones", " B. Amazon CloudFront to edge locations", // 189
                    " C. AWS CloudFormation in multiple regions", "D. A virtual private gateway over AWS Direct Connect"},
            new String[]{"A. AWS Config", " B. AWS Certificate Manager", // 190
                    " C. Amazon Inspector", "D. AWS Artifact"},
            new String[]{"A. Amazon Route 53", " B. AWS X-Ray", // 191
                    " C. AWS Snowmobile", "D. Amazon Elastic Compute Cloud (Amazon EC2)"},
            new String[]{"A. Access to a Technical Project Manager", " B. Access to a Technical Account Manager", // 192
                    " C. Access to a Cloud Support Engineer", "D. Access to a Solutions Architect"},
            new String[]{"A. Deploy applications across multiple Availability Zones within an AWS Region.", " B. Use a hybrid cloud computing deployment model within the geographic area.", // 193
                    " C. Deploy applications across multiple AWS Regions.", "D. Store application artifacts using AWS Artifact and replicate them across multiple AWS Regions."},
            new String[]{"A. It provides on-demand resources for peak usage.", " B. It automates the provisioning of individual developer environments.", // 194
                    " C. It automates customer relationship management.", "D. It implements a fixed monthly computing budget."},
            new String[]{"A. Elasticity", " B. Reliability", // 195
                    " C. Performance", "D. Agility"},
            new String[]{"A. Business and Developer Support", " B. Business and Basic Support", // 196
                    " C. Enterprise and Developer Support", "D. Enterprise and Business Support"},
            new String[]{"A. AWS WAF", " B.  Amazon DynamoDB", // 197
                    " C. Amazon EC2", "D. Amazon CloudFront", "E. Amazon Inspector"},
            new String[]{"A. Compute costs", " B.  Facilities costs", // 198
                    " C. Storage costs", "D. Data transfer costs", "E. Network infrastructure costs", "F. Hardware lifecycle costs"},
            new String[]{"A. Amazon Rekognition provides automatic watermarking of images.", " B. Amazon Rekognition provides automatic detection of objects appearing in pictures.", // 199
                    " C. Amazon Rekognition provides the ability to resize millions of images automatically.", "D. Amazon Rekognition uses Amazon Mechanical Turk to allow humans to bid on object detection jobs."},
            new String[]{"A. Data center security", " B. Business analysis", // 200
                    " C. Project management", "D. Operating system administration"},

            new String[]{"A. Configuring Amazon VPC", " B. Managing application code", // 201
                    " C. Maintaining application traffic", "D. Managing the network infrastructure"},
            new String[]{"A. AWS TCO Calculator", " B. AWS Simple Monthly Calculator", // 202 //Cost Explorer is for forecasting your costs, while AWS Simple Monthly Calculator is for estimation of planned resources by service. Answer should be B
                    " C. AWS Cost Explorer API", "D. AWS Budgets"},
            new String[]{"A. AWS Organizations", " B. AWS Trusted Advisor", // 203
                    " C. AWS Usage Report", "D. Amazon EC2 dashboard"},
            new String[]{"A. AWS Config", " B. Amazon CloudWatch", // 204
                    " C. AWS X-Ray", "D. AWS CloudTrail"},
            new String[]{"A. Partial Upfront Reserved Instances for a 1-year term", " B. All Upfront Reserved Instances for a 1-year term", // 205
                    " C. All Upfront Reserved Instances for a 3-year term", "D. No Upfront Reserved Instances for a 3-year term"},
            new String[]{"A. Setting up AWS Identity and Access Management (IAM) users and groups", " B. Physically destroying storage media at end of life", // 206
                    " C. Patching guest operating systems", "D. Configuring security settings on Amazon EC2 instances"},
            new String[]{"A. AWS audits user data.", " B. Data is automatically secure.", // 207
                    " C. There is no guessing on capacity needs.", "D. AWS manages compliance needs."},
            new String[]{"A. AWS Lambda", " B. Amazon DynamoDB Accelerator", // 208
                    " C. Amazon Route 53", "D. Amazon CloudFront"},
            new String[]{"A. AWS Elastic Beanstalk", " B. AWS CodeCommit", // 209
                    " C. AWS Data Pipeline", "D. AWS CloudFormation", "E. AWS Config"},
            new String[]{"A. AWS Budgets", " B. Cost Explorer", // 210
                    " C. AWS Total Cost of Ownership (TCO) Calculator", "D. AWS Well-Architected Tool"},
            new String[]{"A. Design for automated failure recovery", " B. Use multiple Availability Zones", // 211
                    " C. Manage changes via documented processes", "D. Test for moderate demand to ensure reliability", "E. Backup recovery to an on-premises environment"},
            new String[]{"A. Rotate passwords and access keys.", " B. Remove MFA tokens.", // 212
                    " C. Move resources to a different AWS Region.", "D. Delete AWS CloudTrail Resources.", "E. Contact AWS Support."},
            new String[]{"A. Consulting AWS technical support at any time day or night", " B. Ensuring an application remains accessible, even if a resource fails", // 213
                    " C. Making any AWS service available for use by paying on demand", "D. Deploying in any part of the world using AWS Regions"},
            new String[]{"A. Amazon Inspector", " B. AWS Web Application Firewall (AWS WAF)", // 214
                    " C. Elastic Load Balancing (ELB)", "D. AWS Shield"},
            new String[]{"A. AWS CloudTrail", " B. Amazon CloudWatch", // 215
                    " C. AWS Cost and Usage report", "D. Amazon Simple Notification Service (Amazon SNS)"},
            new String[]{"A. A user associated with an AWS resource", " B. A group associated with an AWS resource", // 216
                    " C. An entity that defines a set of permissions for use with an AWS resource", "D. An authentication credential associated with a multi-factor authentication (MFA) token"},
            new String[]{"A. They provide a discount over on-demand pricing.", " B. They provide access to additional instance types.", // 217
                    " C. They provide additional networking capability.", "D. Customers can upgrade instances as new types become available.", "E. Customers can reserve capacity in an Availability Zone."},
            new String[]{"A. They automatically add more instances across multiple AWS Regions based on global demand of the application.", " B. They automatically add or replace instances across multiple Availability Zones when the application needs it.", // 218
                    " C. They enable the application's static content to reside closer to end users.", "D. They are able to distribute incoming requests across a tier of web server instances."},
            new String[]{"A. By using Amazon EC2 Dedicated Instances", " B. By using AWS Organizations consolidated billing", // 219
                    " C. By using the AWS Cost Explorer tool", "D. By using AWS Budgets"},
            new String[]{"A. 3 hours, 5 minutes", " B. 3 hours, 5 minutes, and 6 seconds", // 220
                    " C. 3 hours, 6 minutes", "D. 4 hours"},

            new String[]{"A. AWS Lambda", " B. Amazon Elastic Container Service (Amazon ECS)", // 221
                    " C. AWS CodeDeploy", "D. Amazon Glacier","E. AWS Organizations"},
            new String[]{"A. Amazon GameLift", " B. AWS CloudFormation", // 222
                    " C. AWS Data Pipeline", "D. AWS Glue"},
            new String[]{"A. Amazon EBS", " B. AWS Direct Connect", // 223
                    " C. Amazon CloudFront", "D. AWS Storage Gateway","E. Amazon Connect"},
            new String[]{"A. AWS CloudHSM", " B. AWS Direct Connect", // 224
                    " C. AWS VPN", "D. Amazon Connect"},
            new String[]{"A. Amazon CloudFront", " B. AWS Shield", // 225
                    " C. Amazon EC2", "D. Amazon RDS","E. Amazon ElastiCache"},
            new String[]{"A. Amazon VPC", " B. AWS Direct Connect", // 226
                    " C. AWS Directory Service", "D. Amazon API Gateway"},
            new String[]{"A. AWS Cost Explorer", " B. AWS Budgets", // 227
                    " C. AWS Cost and Usage report", "D. AWS Total Cost of Ownership (TCO) Calculator"},
            new String[]{"A. Users pay for software by the hour or month depending on licensing.", " B. AWS Marketplace enables the user to launch applications with 1-Click.", // 228
                    " C. AWS Marketplace data encryption is managed by a third-party vendor.", "D. AWS Marketplace eliminates the need to upgrade to newer software versions.", "E. Users can deploy third-party software without testing."},
            new String[]{"A. Scale up, not out.", " B. Loosely couple components.", // 229
                    " C. Build monolithic systems.", "D. Use commercial database software."},
            new String[]{"A. Firmware upgrades of network infrastructure", " B. Patching of operating systems", // 230
                    " C. Patching of the underlying hypervisor", "D. Physical security of data centers", "E. Configuration of the security group"},
            new String[]{"A. AWS Trusted Advisor", " B. Amazon GuardDuty", // 231
                    " C. Amazon Inspector", "D. AWS Config"},
            new String[]{"A. AWS CloudTrail", " B. AWS Trusted Advisor", // 231
                    " C. Amazon CloudWatch", "D. Amazon Inspector"},
            new String[]{"A. It is solely the responsibility of the customer.", " B. It is solely the responsibility of AWS.", // 233
                    " C. It is shared between AWS and the customer.", "D. It is not part of the AWS shared responsibility model."},
            new String[]{"A. AWS CloudFormation", " B. AWS Direct Connect", // 234
                    " C. Amazon CloudFront", "D. Amazon Pinpoint"},
            new String[]{"A. Security", " B. Reliability", // 235
                    " C. Elasticity", "D. High availability"},
            new String[]{"A. AWS Premium Support", " B. AWS Technical Account Manager", // 236
                    " C. AWS Solutions Architect", "D. AWS Abuse team"},

            new String[]{"A. There are no upfront commitments.", " B. AWS manages all security in the cloud.", // 237
                    " C. Users have the ability to provision resources on demand.", "D. Users have access to free and unlimited storage.", "E. Users have control over the physical infrastructure."},

            new String[]{"A. AWS Service Catalog", " B. AWS Config", // 238
                    " C. AWS Trusted Advisor", "D. AWS Organizations"},
            new String[]{"A. It is an AWS staff member who provides recommendations and best practices on how to use AWS.", " B. It is a network of AWS partners who provide recommendations and best practices on how to use AWS.", // 239
                    " C. It is an online tool with a set of automated checks that provides recommendations on cost optimization, performance, and security.", "D. It is another name for AWS Technical Account Managers who provide recommendations on cost optimization, performance, and security."},
            new String[]{"A. AWS Budgets", " B. AWS Cost Explorer", // 240
                    " C. AWS Organizations", "D. Consolidated billing"},
            new String[]{"A. Go global in minutes", " B. Use serverless architectures", // 241
                    " C. Ability to recover from failure", "D. Anticipate failure", "E. Perform operations as code"},
            new String[]{"A. Perform operations as code", " B. Anticipate failure", // 242
                    " C. Design for cost optimization", "D. Manage change in automation", "E. Automatically recover from failure"},
            new String[]{"A. Make frequent, small, reversible changes", " B. Learn from all operational failures", // 243
                    " C. Stop guessing capacity", "D. Use serverless architectures", "E. Measure overall efficiency"},
            new String[]{"A. Enable traceability", " B. Protect data in transit and at rest", // 244
                    " C. Stop guessing capacity", "D. Test recovery procedures", "E. Perform operations as code"},
            new String[]{"A. Stop guessing capacity", " B.Automatically recover from failure", // 245
                    " C. Prepare for security events", "D.  Go global in minutes", "E. Perform operations as code"},
            new String[]{"A. Adopt a consumption model", " B. Measure overall efficiency", // 246
                    " C. Go global in minutes", "D. Test recovery procedures", "E. Stop guessing capacity"},
            new String[]{"A. Cost Optimization", " B. Service Limits", // 247
                    " C. Infrastructure", "D. Latency", "E. Availability"},
            new String[]{"A. WAF", " B. AWS DynamoDB", // 248
                    " C. VPC", "D. AWS Storage Gateway"},
            new String[]{"A. CloudFormation", " B. OPSWork", // 249 //      "Which of those services are free but could provide services which cost money? (Choose two.)", //kk
                    " C. AWS Athena", "D. AWS CloudFront", "E. AWS RDS"},
            new String[]{"A. Enterprise: $15k+/m", " B. Business: $100+/m", // 250
                    "C. Business: $1k+/m", "D. Developer: $100+/m ", "E. Enterprise: $1k+/m"},
            new String[]{"A. Hosting applications", " B. Delivering content closer to users", // 251
                    "C. Running NoSQL database caching services", "D. Reducing traffic on the server by caching responses", "E. Sending notification messages to end users"},
            new String[]{"A. log in to the AWS Management Console.", " B. make programmatic calls to AWS from AWS APIs.", // 252
                    " C. log in to Amazon EC2 instances.", "D. authenticate to AWS CodeCommit repositories."},// 253
            new String[]{"A. AWS Config", " B. AWS Elastic Beanstalk", // 253
                    " C. Amazon Route 53", "D. Amazon CloudFront"},
            new String[]{"A. AWS IAM", " B. Amazon Connect", // 254
                    " C. Amazon VPC", "D. Amazon API Gateway"},
            new String[]{"A. Coupling", " B. Availability", // 255
                    " C. Security", "D. Durability"},
    }; //end of question answer options
}


/*

//43
    A. Make frequent, small, reversible changes
    B. Learn from all operational failures
    C. Stop guessing capacity
    D. Use serverless architectures
    E. Measure overall efficiency

//44
    A. Enable traceability
    B. Protect data in transit and at rest
    C. Stop guessing capacity
    D. Test recovery procedures
    E. Perform operations as code

//45
    A. Stop guessing capacity
    B. Automatically recover from failure
    C. Prepare for security events
    D. Go global in minutes
    E. Perform operations as code

//46
    A. Adopt a consumption model
    B. Measure overall efficiency
    C. Go global in minutes
    D. Test recovery procedures
    E. Stop guessing capacity
 */

/*
    public static String[] getQTags(int q) {
        HashMap<Integer,  String[]> qTags = new HashMap<>();
        qTags.put(0, new String[]{"Responsibility"});
        qTags.put(1, new String[]{""});
        qTags.put(2, new String[]{"Storage"});

 qTags.put(147, new String[]{"EC2"});
         qTags.put(149, new String[]{"Migration"});
 qTags.put(150, new String[]{"EC2"});
        return qTags.get(q);
    }
 */