/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.service.demo.domain;

import java.io.Serializable;

public class RecordRow implements Serializable {

    private Long id;
    private String code;
    private String desc;
    private MedicalRecord medicalRecord;

    public RecordRow() {
    }

    public RecordRow(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RecordRow{" + "id=" + id + ", code=" + code + ", desc=" + desc + ", medicalRecord=" + medicalRecord + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RecordRow other = (RecordRow) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.code == null) ? (other.code != null) : !this.code.equals(other.code)) {
            return false;
        }
        if ((this.desc == null) ? (other.desc != null) : !this.desc.equals(other.desc)) {
            return false;
        }
        if (this.medicalRecord != other.medicalRecord && (this.medicalRecord == null || !this.medicalRecord.equals(other.medicalRecord))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 13 * hash + (this.code != null ? this.code.hashCode() : 0);
        hash = 13 * hash + (this.desc != null ? this.desc.hashCode() : 0);
        hash = 13 * hash + (this.medicalRecord != null ? this.medicalRecord.hashCode() : 0);
        return hash;
    }

}
