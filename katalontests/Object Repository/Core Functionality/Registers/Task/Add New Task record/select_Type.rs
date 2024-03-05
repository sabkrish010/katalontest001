<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>select_Type</name>
   <tag></tag>
   <elementGuidId>b25a76c2-4239-4d59-92b3-13ce9df4ff5b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>id(&quot;Type&quot;)[count(. | //select[@id = 'Type' and @name = 'Type' and @title = 'Type']) = count(//select[@id = 'Type' and @name = 'Type' and @title = 'Type'])]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>select</value>
      <webElementGuid>fc6ff58f-d6f4-4373-8eb9-35c16df90879</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>combo-box editable</value>
      <webElementGuid>fd46a9ec-6b77-437b-a6ba-003883f3c605</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-bind</name>
      <type>Main</type>
      <value>options: clue.lookup('3048c51d-827e-4fef-b4d3-9e04217d0e09', model.Type()), value: model.Type,
event: {
    change: function (vm) {
        if (/*vm.model.Id() === 0 &amp;&amp;*/ !vm.hasEditedSubject) {
            var subject = model.Type();
            if (subject) {
                subject = subject.trim();
            } else {
                subject = '';
            }
            var subType = model.SubType();
            if (subType) {
                subType = subType.trim();
            } else {
                subType = '';
            }
            if (subType.length > 0) {
                if (subject.length > 0) {
                    subject += ' - ';
                }
                subject += subType;
            }
            vm.model.Subject(subject);
        };
       clue.SetSubtypeEmpty(model.SubtypeVisible,'ea62a990-3c16-494b-8f3e-02a3f64f4039', model.SubType, model.Type);
        return true;
    }
}</value>
      <webElementGuid>fae08211-188a-4d2a-b83c-94786050cd32</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-val</name>
      <type>Main</type>
      <value>true</value>
      <webElementGuid>7aa0ed74-b1e0-4b5c-9371-b72d2c64dc06</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-val-length</name>
      <type>Main</type>
      <value>The field Type must be a string with a maximum length of 50.</value>
      <webElementGuid>cc5fba5c-723f-4b88-9052-dda2f88f1c37</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-val-length-max</name>
      <type>Main</type>
      <value>50</value>
      <webElementGuid>666199e7-2c84-461d-91ce-6c4752655e24</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-val-required</name>
      <type>Main</type>
      <value>The Type field is required.</value>
      <webElementGuid>18608e74-6044-4c98-968b-27dfb33bbf7f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>Type</value>
      <webElementGuid>5153b459-2a4f-4164-9797-5f02ec374fbd</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>Type</value>
      <webElementGuid>02d8301e-d46d-456a-9bb8-4c5109879b6d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>title</name>
      <type>Main</type>
      <value>Type</value>
      <webElementGuid>4ac9e3ff-b982-4db9-b133-f4e351c47bec</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;Type&quot;)</value>
      <webElementGuid>2a810cee-5b93-4847-9f9c-2c55ed57a104</webElementGuid>
   </webElementProperties>
</WebElementEntity>
