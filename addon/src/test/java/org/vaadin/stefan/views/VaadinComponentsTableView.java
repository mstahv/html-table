/*
 * Copyright 2021 by Stefan Uebe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.stefan.views;

import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableCell;
import org.vaadin.stefan.table.TableRow;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("vaadin-table")
public class VaadinComponentsTableView extends Div {

    public VaadinComponentsTableView() {
        Table table = new Table();

        TableRow headerRow = table.addRow();
        headerRow.addHeaderCell().setText("Name");
        headerRow.addHeaderCell().setText("Age");

        for (int i = 0; i < 10; i++) {
            TextField textField = new TextField();
            textField.setValue("Some user " + i );

            NumberField numberField = new NumberField();
            numberField.setValue((double) (20 + i));

            TableRow detailsRow = table.addRow();
            detailsRow.addDataCell().add(textField);
            detailsRow.addDataCell().add(numberField);
        }

        add(table);
    }


}
