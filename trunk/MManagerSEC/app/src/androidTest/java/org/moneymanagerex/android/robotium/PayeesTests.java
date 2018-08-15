/*
 * Copyright (C) 2012-2018 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.moneymanagerex.android.robotium;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;

import br.com.softctrl.mmanagersec.app.R;
import com.money.manager.ex.home.MainActivity;
import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.moneymanagerex.android.testhelpers.UiTestHelpersRobotium;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Payees list
 */
@RunWith(AndroidJUnit4.class)
public class PayeesTests {
    // extends ActivityInstrumentationTestCase2<MainActivity>

    private Solo solo;

//    public PayeesTests() {
//        super(MainActivity.class);
//    }

//    @Before
//    public void setUp() {
//        solo = UiTestHelpersRobotium.setUp(this);
//    }

    @After
    public void tearDown() throws Exception {
//        super.tearDown();

        UiTestHelpersRobotium.tearDown(solo);
    }

//    @Test
//    public void formOpens() {
//        assertThat(solo.waitForActivity(getActivity().getClass().getSimpleName())).isTrue();
//    }

    @Test
    public void fragmentOpens() {
        UiTestHelpersRobotium helper = new UiTestHelpersRobotium(solo);

        helper.openPayeesList();

//        assertThat(solo.waitForText("Balance Adjustment")).isTrue();
    }

    @Test
    public void getNotificationForPayeeThatCanNotBeDeleted() {
        UiTestHelpersRobotium robot = new UiTestHelpersRobotium(solo);

        robot.openPayeesList();

        solo.clickOnText("Balance Adjustment");
        solo.clickOnText("Delete");

        solo.waitForDialogToOpen();

//        assertThat(solo.searchText("can not be deleted")).isTrue();

        solo.clickOnText("OK");
    }

    @Test
    public void canCreateAndDeletePayee() {
        // Given

        UiTestHelpersRobotium robot = new UiTestHelpersRobotium(solo);
        final String payeeName = "Test Payee";
        robot.openPayeesList();

        // When

        robot.clickOnFloatingButton();

        solo.waitForDialogToOpen();
        EditText editText = solo.getEditText(0);
        solo.enterText(editText, payeeName);
        solo.clickOnText("OK");
        solo.waitForDialogToClose();

        // delete
        solo.clickOnText(payeeName);
        solo.clickOnText("Delete");
        solo.clickOnText("OK");

        // Then

//        assertThat(solo.searchText(payeeName)).isFalse();
    }

}
