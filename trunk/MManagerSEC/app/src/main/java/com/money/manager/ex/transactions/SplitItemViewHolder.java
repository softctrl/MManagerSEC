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

package com.money.manager.ex.transactions;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import br.com.softctrl.mmanagersec.app.R;
import com.shamanland.fonticon.FontIconView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * View Holder pattern for Split Category.
 * Adapter position is provided automatically by .getAdapterPosition().
 */
public class SplitItemViewHolder
    extends RecyclerView.ViewHolder {

    @BindView(R.id.textViewCategory) public TextView txtSelectCategory;
    @BindView(R.id.editTextTotAmount) public TextView txtAmount;
    @BindView(R.id.transactionTypeButton) public FontIconView transactionTypeButton;

    public SplitItemViewHolder(View itemView) {
        super(itemView);

//        transactionTypeButton = (FontIconView) itemView.findViewById(R.id.transactionTypeButton);
//        txtSelectCategory = (TextView) itemView.findViewById(R.id.textViewCategory);
//        txtAmount = (TextView) itemView.findViewById(R.id.editTextTotAmount);

        ButterKnife.bind(this, itemView);
    }
}
