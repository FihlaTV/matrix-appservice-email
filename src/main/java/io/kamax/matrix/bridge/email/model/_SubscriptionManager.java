/*
 * matrix-appservice-email - Matrix Bridge to E-mail
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.matrix.bridge.email.model;

import io.kamax.matrix.client._MatrixClient;

import java.util.Optional;

public interface _SubscriptionManager {

    _BridgeSubscription getOrCreate(String roomId, _MatrixClient mxUser, _EmailClient emClient);

    Optional<_BridgeSubscription> get(String emailKey);

    Optional<_BridgeSubscription> remove(String emailKey);

    Optional<_BridgeSubscription> remove(String roomId, _MatrixClient mxUser, _EmailClient emClient);

}
