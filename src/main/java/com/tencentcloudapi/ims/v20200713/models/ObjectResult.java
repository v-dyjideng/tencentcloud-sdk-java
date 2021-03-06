/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectResult extends AbstractModel{

    /**
    * 场景识别结果
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 建议值，Block：打击，Review：待复审，Pass：正常
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义图片
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 子标签检测结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 该标签模型命中的分值
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 实体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 实体检测结果明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private ObjectDetail [] Details;

    /**
     * Get 场景识别结果 
     * @return Scene 场景识别结果
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 场景识别结果
     * @param Scene 场景识别结果
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 建议值，Block：打击，Review：待复审，Pass：正常 
     * @return Suggestion 建议值，Block：打击，Review：待复审，Pass：正常
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议值，Block：打击，Review：待复审，Pass：正常
     * @param Suggestion 建议值，Block：打击，Review：待复审，Pass：正常
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义图片 
     * @return Label 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义图片
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义图片
     * @param Label 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义图片
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 子标签检测结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubLabel 子标签检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 子标签检测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubLabel 子标签检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get 该标签模型命中的分值 
     * @return Score 该标签模型命中的分值
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该标签模型命中的分值
     * @param Score 该标签模型命中的分值
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 实体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Names 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Names 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 实体检测结果明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 实体检测结果明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 实体检测结果明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 实体检测结果明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(ObjectDetail [] Details) {
        this.Details = Details;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

