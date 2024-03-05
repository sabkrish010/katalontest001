<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_MG12 Exhibit List</name>
   <tag></tag>
   <elementGuidId>6f1a217f-a6bf-4ff2-a6ed-702064c9918f</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[8]/div[2]/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.overflow-hidden.h-full</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>a989e5c2-00fe-44e0-95f2-eb828c3bf385</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>overflow-hidden h-full</value>
      <webElementGuid>bb8f6d41-0542-46bf-9249-8d7e86a7cf99</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
                
                    MG12 Exhibit List
                
            

            
    

    window.webViewer = null;
    window.addWebviewer = function(file)  {
        var viewer = document.getElementById('cluedocwebviewer');
        if (viewer) {
            const webviewerParentHeight = document.querySelector('#cluedocwebviewer').parentElement.clientHeight;
            const headingHeightOffset = document.querySelector('#tab-contents') === null ? 60 : 20;
            $(viewer).css(&quot;height&quot;, (webviewerParentHeight - headingHeightOffset + 'px'));

            var fileUrl = '/tennis/ReportApi/Get?reportName=MG12%20Exhibit%20List&amp;recordId=60454&amp;parameters=%7B%22Urn%22%3A%7B%22%24type%22%3A%22ScalarString%22%2C%22Value%22%3A%22421%22%7D%2C%22ContainerId%22%3A%7B%22%24type%22%3A%22ScalarString%22%2C%22Value%22%3A%225%22%7D%2C%22AttachmentIds%22%3A%7B%22%24type%22%3A%22ScalarString%22%7D%7D&amp;recipientId=0&amp;isPdf=&amp;bContinuationSheet=false&amp;addToReportHistory=false';
            var fileName = 'MG12 Exhibit List';
            var fileExtension = 'docx';

            if (file) {
                fileUrl = file.Url;
                fileName = file.Name;
                fileExtension = file.Extension;
            }

            var loadDocument = function () {
                window.webViewer.UI.loadDocument(fileUrl, {
                    initialDoc: fileUrl,
                    isReadOnly: true,
                    fullAPI: true,
                    enableAnnotations: false,
                    isReadOnly: true,
                    loadAsPdf: true,
                    filename: fileName,
                    extension: fileExtension,
                    documentType: fileExtension
                });

                window.webViewer.UI.setHeaderItems(header => {
                    if (header.getItems().find(obj => { return obj.title == 'Download' })) {
                        header.pop();
                    } else {
                        const iframeDoc = window.webViewer.UI.iframeWindow.document;
                        const printButton = iframeDoc.querySelector('[data-element=&quot;printButton&quot;]');
                        printButton.addEventListener('click', () => {
                            Telemetry.post('FilePreviewPrinted');
                        });
                    }
                    header.push({
                        type: 'actionButton',
                        img: 'images/download.png',
                        title: 'Download',
                        onClick: async () => {
                            Telemetry.post('FilePreviewSaved', null, { 'documentType': fileExtension });
                            window.open(fileUrl);
                        }
                    });
                });
            }

            if (window.webViewer === null) {
                WebViewer({
                    path: window.location.origin + '/tennis/Content/WebViewer/lib',
                    config: window.location.origin + '/tennis/Content/WebViewer/config.js',
                    disabledElements: [
                        'toolbarGroup-View',
                        'addNewOutlineButton',
                        'outlineMultiSelect',
                        'ribbons',
                        'toolsHeader',
                        'downloadButton',
                        'saveAsButton'
                    ],
                    licenseKey: 'Insert commercial license key here after purchase'
                }, document.getElementById('cluedocwebviewer'))
                    .then(instance => {
                        window.webViewer = instance;
                        loadDocument();
                    });
            }
            else {
                loadDocument();
            }
       }
    };


        
    </value>
      <webElementGuid>bcce8673-18ab-4fbd-b787-2d4a0245e1eb</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;ui-id-3&quot;)/div[@class=&quot;overflow-hidden h-full&quot;]</value>
      <webElementGuid>22818496-b38a-4b54-8433-2f78682de165</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='ui-id-3']/div</value>
      <webElementGuid>b2686082-c5c7-4197-a06c-bd5d1dfa244a</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Close'])[2]/following::div[2]</value>
      <webElementGuid>29352162-ff45-44e4-ba76-e47e5d537937</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='File Preview'])[1]/following::div[2]</value>
      <webElementGuid>bd995940-7ba6-4dd9-84ba-67be2eb2cb6b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[8]/div[2]/div</value>
      <webElementGuid>d9e03eb0-9bb6-4506-b152-a44309a9f279</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
