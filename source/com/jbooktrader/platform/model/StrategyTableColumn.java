package com.jbooktrader.platform.model;

public enum StrategyTableColumn {
    Strategy("Strategy", String.class),
    Symbol("Symbol", String.class),
    Balance("Balance", Integer.class),
    LowPrice("Low Price", Double.class),
    HighPrice("High Price", Double.class),
    Position("Position", Integer.class),
    Trades("Trades", Integer.class),
    MaxDD("Max DD", Double.class),
    NetProfit("Net Profit", Double.class);

    private final String columnName;
    private final Class<?> columnClass;

    StrategyTableColumn(String columnName, Class<?> columnClass) {
        this.columnName = columnName;
        this.columnClass = columnClass;
    }

    public String getColumnName() {
        return columnName;
    }

    public Class<?> getColumnClass() {
        return columnClass;
    }

}